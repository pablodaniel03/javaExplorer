package com.oracle.shop;

import com.oracle.shop.components.order.Order;
import com.oracle.shop.components.shoppingCart.ShoppingCart;


public class ShopApp {
  
  public static void main(String[] args) {

    Customer customer = new Customer();
    Order order = new Order();
    ShoppingCart shoppingCart = new ShoppingCart();


    customer.name = "Enrique";
    order.customer = customer;
    shoppingCart.currentOrder = order;

    System.out.println("Customer name is \"" + customer.name + "\".");
    //System.out.println("Items in shopping cart is \"" + order.itemList.size() + "\".");
    System.out.println("Order's owner is \"" + order.customer.name + "\".");


  }
}
