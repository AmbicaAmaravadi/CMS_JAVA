package com.hexaware.MLP148.persistence;

import java.util.List;

import com.hexaware.MLP148.model.Orders;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * EmpomerHistoryDAO class used to fetch data from data base.
 * @author hexware
 */
public interface OrdersDAO {
    /**
     * @param custid the customerhistory data
     * @return the all the customerHistory record.
     */
  @SqlQuery("Select * from Orders where CUST_ID = :CUST_ID")
    @Mapper(OrdersMapper.class)
    List<Orders> show(@Bind("CUST_ID")int custid);
    /**
     * @param venid the vendorhistory data
     * @return the all the customerHistory record.
     */
  @SqlQuery("Select * from Orders where V_ID = :V_ID")
    @Mapper(OrdersMapper.class)
    List<Orders> showvendor(@Bind("V_ID")int venid);
}

