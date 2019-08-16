package com.hexaware.MLP148.factory;

import java.util.List;

import com.hexaware.MLP148.model.Orders;

import com.hexaware.MLP148.persistence.OrdersDAO;
import com.hexaware.MLP148.persistence.DbConnection;

/**
 * CustomerHistoryFactory class used to fetch menu data from database.
 * @author hexware
 */
public class OrdersFactory {
  /**
   * Protected constructor.
   */
  protected OrdersFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static OrdersDAO dao() {
    DbConnection dbv = new DbConnection();
    return dbv.getConnect().onDemand(OrdersDAO.class);
  }
  /**
   * Call the data base connection.
   * @param custid customer id
   * @return the array of menu object.
   */
  public static Orders[] showHistory(final int custid) {
    List<Orders> customer = dao().show(custid);
    return customer.toArray(new Orders[customer.size()]);
  }
  /**
   * Call the data base connection.
   * @param venid vendor id
   * @return the array of menu object.
   */
  public static Orders[] showVenHistory(final int venid) {
    List<Orders> vendor = dao().showvendor(venid);
    return vendor.toArray(new Orders[vendor.size()]);
  }
}
