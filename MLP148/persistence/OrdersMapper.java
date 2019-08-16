package com.hexaware.MLP148.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
import com.hexaware.MLP148.model.Orders;

/**
 * HistoryMapper class used to fetch customer and vendor history data from database.
 * @author hexware
 */
public class OrdersMapper implements ResultSetMapper<Orders> {
/**
 * @param idx the index
 * @param rs the resultset
 * @param ctx the context
 * @return the mapped Customer&vendor object
 * @throws SQLException in case there is an error in fetching data from the resultset
 */
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
  /**
   * @return Customer&Vendor History
   */
    return new Orders(rs.getInt("O_ID"), rs.getInt("FOOD_ID"),
                      rs.getInt("CUST_ID"), rs.getInt("V_ID"),
                      rs.getString("STATUS"), rs.getString("ORDER_DATE"),
                      rs.getInt("QUANTITY"), rs.getInt("TOTAL_AMOUNT"),
                      rs.getString("ESTIMATED_TIME"), rs.getString("CANCEL_TIME"));
  }
}
