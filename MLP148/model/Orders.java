package com.hexaware.MLP148.model;

import java.util.Objects;
/**
 * Orders class used to display Orders information.
 * @author hexware
 */
public class Orders {
/**
 * foodId to store foodId.
 */
  private int foodId;
/**
 * orderId to store orderId.
 */
  private int orderId;
/**
 * CustId to store CustId.
 */
  private int custId;
/**
 * vId to store vId.
 */
  private int vId;
/**
 * status to store status.
 */
  private String status;
/**
 * orderdate to store orderdate.
 */
  private String orderdate;
/**
 * quantity to store quantity.
 */
  private int quantity;
/**
 * totalamount to store totalamount.
 */
  private int totalamount;
/**
 * estimatedtime to store estimatedtime.
 */
  private String estimatedtime;
/**
 * canceltime to store canceltime.
 */
  private String canceltime;
  /**
   * Default Constructor.
   */
  public Orders() {
  }
/**
 * @param argFoodId to initialize food Id.
 * used to get details through constructor.
 * @param argOrderId to initialize order Id.
 * used to get details through constructor.
 * @param argCustId to initialize Customer Id.
 * used to get details through constructor.
 * @param argVid to initialize vendor id.
 * used to get details through constructor.
 * @param argStatus to initialize status.
 * used to get details through constructor.
 * @param argOrderDate to initialize order date.
 * used to get details through constructor.
 * @param argQuantity to initialize quantity.
 * used to get details through constructor.
 * @param argTotalamount to initialize totalamount.
 * used to get details through constructor.
 * @param argEstimatedtime to initialize estimated time.
 * used to get details through constructor.
 * @param argCanceltime to initialize cancel time.
 * used to get details through constructor.
 */
  public Orders(final int argFoodId, final int argOrderId, final int argCustId, final int argVid, final String argStatus,
      final String argOrderDate, final int argQuantity, final int argTotalamount, final String argEstimatedtime,
      final  String argCanceltime) {
    this.foodId = argFoodId;
    this.orderId = argOrderId;
    this.custId = argCustId;
    this.vId = argVid;
    this.status = argStatus;
    this.orderdate = argOrderDate;
    this.quantity = argQuantity;
    this.totalamount = argTotalamount;
    this.estimatedtime = argEstimatedtime;
    this.canceltime = argCanceltime;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Orders orders = (Orders) obj;
    if (Objects.equals(foodId, orders.foodId) && Objects.equals(orderId, orders.orderId)
        && Objects.equals(custId, orders.custId) && Objects.equals(vId, orders.vId)
        && Objects.equals(status, orders.status) && Objects.equals(orderdate, orders.orderdate)
        && Objects.equals(quantity, orders.quantity) && Objects.equals(totalamount, orders.totalamount)
        && Objects.equals(estimatedtime, orders.estimatedtime) && Objects.equals(canceltime, orders.canceltime)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId, orderId, custId, vId, status, orderdate, quantity, totalamount, estimatedtime, canceltime);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
    /**
     * @return this order ID.
     */
  public final int getOrderId() {
    return orderId;
  }
    /**
     * @param argOrderId gets the order id.
     */
  public final void setOrderId(final int argOrderId) {
    this.orderId = argOrderId;
  }
    /**
     * @return this Cust id.
     */
  public final int getCustId() {
    return custId;
  }
    /**
     * @param argCustId gets the Custid.
     */
  public final void setCustId(final int argCustId) {
    this.custId = argCustId;
  }
    /**
     * @return this v id.
     */
  public final int getVId() {
    return vId;
  }
    /**
     * @param argVId gets the v id.
     */
  public final void setVId(final int argVId) {
    this.vId = argVId;
  }
    /**
     * @return this status.
     */
  public final String getStatus() {
    return status;
  }
    /**
     * @param argStatus gets the status.
     */
  public final void setStatus(final String argStatus) {
    this.status = argStatus;
  }
    /**
     * @return this orderdate.
     */
  public final String getOrderdate() {
    return orderdate;
  }
    /**
     * @param argOrderDate gets the status.
     */
  public final void setOrderdate(final String argOrderDate) {
    this.orderdate = argOrderDate;
  }
    /**
     * @return this quantity.
     */
  public final int getQuantity() {
    return quantity;
  }
    /**
     * @param argQuantity gets the status.
     */
  public final void setQuantity(final int argQuantity) {
    this.quantity = argQuantity;
  }
    /**
     * @return this totalamount.
     */
  public final int getTotalamount() {
    return totalamount;
  }
    /**
     * @param argTotalamount gets the status.
     */
  public final void setTotalamount(final int argTotalamount) {
    this.totalamount = argTotalamount;
  }
    /**
     * @return this estimatedtime.
     */
  public final String getEstimatedtime() {
    return estimatedtime;
  }
    /**
     * @param argEstimatedtime gets the status.
     */
  public final void setEstimatedtime(final String argEstimatedtime) {
    this.estimatedtime = argEstimatedtime;
  }
    /**
     * @return this canceltime.
     */
  public final String getCanceltime() {
    return canceltime;
  }
    /**
     * @param argCanceltime gets the status.
     */
  public final void setCanceltime(final String argCanceltime) {
    this.canceltime = argCanceltime;
  }
}

