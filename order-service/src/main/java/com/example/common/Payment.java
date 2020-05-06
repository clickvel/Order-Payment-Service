 package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

 
  private int paymentId;
  private String paymentStatus;
  private String transactionId;
  private int orderID;
  private double amount;
  
  
  public int getPaymentId() {
    return paymentId;
  }
  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }
  public String getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  public int getOrderID() {
    return orderID;
  }
  public void setOrderID(int orderID) {
    this.orderID = orderID;
  }
  public double getAmount() {
    return amount;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
}
