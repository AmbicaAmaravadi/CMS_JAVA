package com.hexaware.MLP148.util;

import java.util.Scanner;

//import com.hexaware.MLP148.factory.HistoryFactory;
import com.hexaware.MLP148.factory.MenuFactory;
import com.hexaware.MLP148.factory.OrdersFactory;
//import com.hexaware.MLP148.factory.VendorHistoryFactory;
import com.hexaware.MLP148.model.Menu;
import com.hexaware.MLP148.model.Orders;

//import com.hexaware.MLP148.model.Vendor;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  /**
   * mainMenu method used to display the option we had in the application.
   */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Customer");
    System.out.println("3. Vendor");
    System.out.println("4. Exit");
    mainMenuDetails();
  }

  /**
   * mainMenuDetails method process the option selected from main menu.
   */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          customerLogin();
          break;
        case 3:
        // VendorShowDetails();
          vendorLogin();
          break;
        case 4:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

  // private void VendorShowDetails() {
  // Vendor[] vendor = VendorFactory.showVendor();
  // System.out.println("VendorId\tVendorName\tuserName\tvendorEmail\tvendorContact\tvendorAddress");
  // }

  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    // System.out.println("Menu_Id");
    System.out.println("FoodId\t\t\t\t\tFoodName\t\t\t\t\tPrice\t\t\t\t\tVendorId");
    for (Menu m : menu) {
      System.out.println(
          m.getFoodId() + "\t\t\t\t\t" + m.getFoodName() + "\t\t\t\t" + m.getPrice() + "\t\t\t\t\t" + m.getVendorId());
    }
  }

  /**
   * Customer login credentials will be asked for authentication.
   */
  private void customerLogin() {
    System.out.println("1.PlaceOrder");
    System.out.println("2.OrderStatus");
    System.out.println("3.CustomerOrderHistory");
    System.out.println("4.Logout");
    System.out.println("Enter the Value");
    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    switch (i) {
      case 1:
        placeOrder();
        break;
      case 2:
        orderStatus();
        break;
      case 3:
        customerOrderhistory();
        break;
      case 4:
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose the valid value");
    }
  }

  private void orderStatus() {
  }

  private void placeOrder() {
  }

  /**
   * CustomerOrderHistory credentials will be checked.
   */

  private void customerOrderhistory() {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the Customer Id");
    int custid = sc1.nextInt();
    Orders[] orders = OrdersFactory.showHistory(custid);
    System.out.println("CUSTOMER ORDER HISTORY");
    System.out.println("VENDORID       CUSTOMERID       ORDERID      FOODID      ORDERDATE        ESTIMATED_TIME    CANCEL_TIME\n  ");
    for (Orders c : orders) {
      System.out.println(c.getVId() + "            " + c.getCustId()
          + "             " + c.getOrderId() + "            " + c.getFoodId()
          + "             " + c.getOrderdate() + "           " + c.getEstimatedtime() + "          " + c.getCanceltime());
    }
  }

  /**
   * Vendor login credentials will be asked for authentication.
   */
  private void vendorLogin() {
    System.out.println("1.VendorOrderStatus");
    System.out.println("2.VendorOrderHistory");
    System.out.println("3.Logout");
    System.out.println("Enter the Value");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    switch (i) {
      case 1:
        vendorStatus();
        break;
      case 2:
        vendorOrderhistory();
        break;
      case 3:
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose valid value");
    }
  }
  private void vendorStatus() {
  }
   /**
   * VendorOrderHistory credentials will be checked.
   */

  private void vendorOrderhistory() {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the vendor Id");
    int venid = sc1.nextInt();
    Orders[] orders = OrdersFactory.showVenHistory(venid);
    System.out.println("VENDOR ORDER HISTORY");
    System.out.println("VENDORID       CUSTOMERID       ORDERID     FOODID          STATUS         QUANTITY       TOTAL_AMOUNT         ORDERDATE        ESTIMATED_TIME    CANCEL_TIME\n  ");
    for (Orders c : orders) {
      System.out.println(c.getVId() + "            " + c.getCustId()
          + "             " + c.getOrderId() + "            " + c.getFoodId()
          + "             " + c.getStatus() + "         " + c.getQuantity() + "               " + c.getTotalamount()
          + "                " + c.getOrderdate() + "           " + c.getEstimatedtime() + "          " + c.getCanceltime());
    }
  }

  /**
   * main method is the basic entry point for the application.
   * @param args used to get the user input.
   */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
