package com.hexaware.MLP148.factory;

import java.util.List;

import com.hexaware.MLP148.model.Vendor;
import com.hexaware.MLP148.persistence.DbConnection;
import com.hexaware.MLP148.persistence.VendorDAO;

/**
 * VendorFactory class used to fetch menu data from database.
 * @author hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection dbv = new DbConnection();
    return dbv.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Vendor[] showMenu() {
    List<Vendor> vendor = dao().show();
    return vendor.toArray(new Vendor[vendor.size()]);
  }
}
