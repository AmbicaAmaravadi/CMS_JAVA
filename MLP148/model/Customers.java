package com.hexaware.MLP148.model;

import java.util.Objects;
/**
 * customers class used to display customers information.
 * @author hexware
 */
public class Customers {
/**
 * custId to store custId.
 */
  private int custId;
/**
 * custName to store custName.
 */
  private String custName;
/**
 * userName to store userName.
 */
  private String userName;
/**
 * passWord to store passWord.
 */
  private String passWord;
/**
 * walletBalance to store walletBalance.
 */
  private float walletBalance;
/**
 * custEmail to store custEmail.
 */
  private String custEmail;
/**
 * custAddress to store custAddress.
 */
  private String custAddress;
/**
 * custContact to store custContact.
 */
  private String custContact;
/**
 * Default Constructor.
 */
  public Customers() {
  }
/**
 * @param argCustId to initialize cust id.
 * @param argCustName to initialize cust name.
 * @param argUserName to initialize username.
 * @param argPassWord to initialize password.
 * @param argWalletBalance to initialize walletbalance.
 * @param argCustEmail to initialize cust email.
 * @param argCustAddress to initialize cust address.
 * @param argCustContact to initialize cust contact.
 * used to get details through constructor.
 */
  public Customers(final int argCustId, final String argCustName, final String argUserName,
                  final String argPassWord, final float argWalletBalance,
                  final String argCustEmail, final String argCustAddress, final String argCustContact) {
    this.custId = argCustId;
    this.custName = argCustName;
    this.userName = argUserName;
    this.passWord = argPassWord;
    this.walletBalance = argWalletBalance;
    this.custEmail = argCustEmail;
    this.custAddress = argCustAddress;
    this.custContact = argCustContact;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customers customers = (Customers) obj;
    if (Objects.equals(custId, customers.custId) && Objects.equals(custName, customers.custName)
        && Objects.equals(userName, customers.userName)
        && Objects.equals(passWord, customers.passWord)
        && Objects.equals(walletBalance, customers.walletBalance)
        && Objects.equals(custEmail, customers.custEmail)
        && Objects.equals(custAddress, customers.custAddress)
        && Objects.equals(custContact, customers.custContact)) {
      return true;
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(custId, custName, userName, passWord, walletBalance, custEmail, custAddress, custContact);
  }
  /**
     * @return this cust ID.
     */
  public final int getCustId() {
    return custId;
  }
    /**
     * @param argCustId gets the cust id.
     */
  public final void setCustId(final int argCustId) {
    this.custId = argCustId;
  }
  /**
     * @return this cust Name.
     */
  public final String getCustName() {
    return custName;
  }
    /**
     * @param argCustName gets the cust Name.
     */
  public final void setCustName(final String argCustName) {
    this.custName = argCustName;
  }
  /**
     * @return this user Name.
     */
  public final String getUserName() {
    return userName;
  }
    /**
     * @param argUserName gets the user Name.
     */
  public final void setUserName(final String argUserName) {
    this.userName = argUserName;
  }
  /**
     * @return this passWord.
     */
  public final String getPassWord() {
    return passWord;
  }
    /**
     * @param argPassWord gets the passWord.
     */
  public final void setPassWord(final String argPassWord) {
    this.passWord = argPassWord;
  }
  /**
     * @return this wallet Balance.
     */
  public final float getWalletBalance() {
    return walletBalance;
  }
    /**
     * @param argWalletBalance gets the wallet balance.
     */
  public final void setWalletBalance(final int argWalletBalance) {
    this.walletBalance = argWalletBalance;
  }
  /**
   * @return this cust EMAIL.
   */
  public final String getCustEmail() {
    return custEmail;
  }
    /**
     * @param argCustEmail gets the cust email.
     */
  public final void setcustEmail(final String argCustEmail) {
    this.custEmail = argCustEmail;
  }
  /**
   * @return this cust Address.
   */
  public final String getCustAddress() {
    return custAddress;
  }
    /**
     * @param argCustAddress gets the cust address.
     */
  public final void setCustAddress(final String argCustAddress) {
    this.custAddress = argCustAddress;
  }
    /**
     * @return this cust contact.
     */
  public final String getCustContact() {
    return custContact;
  }
    /**
     * @param argCustContact gets the cust contact.
     */
  public final void setcustContact(final String argCustContact) {
    this.custContact = argCustContact;
  }
}
