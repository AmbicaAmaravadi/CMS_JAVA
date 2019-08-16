package com.hexaware.MLP148.persistence;

import java.util.List;

//import com.hexaware.MLP148.model.Menu;
import com.hexaware.MLP148.model.Vendor;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from VENDOR")
    @Mapper(VendorMapper.class)
    List<Vendor> show();
}
