package com.hexaware.MLP148.model;

import java.util.Objects;
/**
 * Vendor class used to display Vendor information.
 * @author hexware
 */
public class Vendor {
/**
  * vId to store vId.
  */
  private int vId;
/**
  * vName to store vName.
  */
  private String vName;
/**
 * userName to store userName.
 */
  private String userName;
/**
 * password to store password.
 */
  private String password;
/**
 * vContact to store vContact.
 */
  private int vContact;
/**
 * vEmail to store vEmail.
 */
  private String vEmail;
/**
 * vAddress to store vAddress.
 */
  private String vAddress;
/**
 * Default Constructor.
 */
  public Vendor() {

  }
/**
 * @param argVId to initialize vendor id.
 * @param argVname to initialize  vendor name.
 * @param argUserName to initialize username.
 * @param argPassword to initialize password.
 * @param argVContact to initialize vendor contact.
 * @param argVEmail to initialize vendor email.
 * @param argVAddress to initialize vendor address.
 * used to get details through constructor.
 */
  public Vendor(final int argVId, final String argVname, final String argUserName, final String argPassword,
              final int argVContact, final String argVEmail, final String argVAddress) {
    this.vId = argVId;
    this.vName = argVname;
    this.userName = argUserName;
    this.password = argPassword;
    this.vContact = argVContact;
    this.vEmail = argVEmail;
    this.vAddress = argVAddress;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) obj;
    if (Objects.equals(vId, vendor.vId)
        && Objects.equals(vName, vendor.vName)
        && Objects.equals(userName, vendor.userName)
        && Objects.equals(password, vendor.password)
        && Objects.equals(vContact, vendor.vContact)
        && Objects.equals(vEmail, vendor.vEmail)
        && Objects.equals(vAddress, vendor.vAddress)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(vId, vName, userName, password, vContact, vEmail, vAddress);
  }
    /**
     * @return this v ID.
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
     * @return this v Name.
     */
  public final String getVName() {
    return vName;
  }
    /**
     * @param argVName gets the v Name.
     */
  public final void setVName(final String argVName) {
    this.vName = argVName;
  }
  /**
     * @return this UserName.
     */
  public final String getUserName() {
    return userName;
  }
    /**
     * @param argUserName gets the UserName.
     */
  public final void setUserName(final String argUserName) {
    this.userName = argUserName;
  }
  /**
     * @return this Password.
     */
  public final String getPassword() {
    return password;
  }
    /**
     * @param argPassword gets the Password.
     */
  public final void setPassword(final String argPassword) {
    this.password = argPassword;
  }
  /**
     * @return this Vcontact.
     */

  public final int getVContact() {

    return vContact;
  }
    /**
     * @param argVContact gets the VContact.
     */

  public final void setVContact(final int argVContact) {

    this.vContact = argVContact;
  }
  /**
     * @return this VEmail.
     */
  public final String getVEmail() {
    return vEmail;
  }
    /**
     * @param argVEmail gets the VEmail.
     */
  public final void setVEmail(final String argVEmail) {
    this.vEmail = argVEmail;
  }
  /**
     * @return this VAddress.
     */
  public final String getVAddress() {
    return vAddress;
  }
    /**
     * @param argVAddress gets the VEmail.
     */
  public final void setVAddress(final String argVAddress) {
    this.vAddress = argVAddress;
  }
}

