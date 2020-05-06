package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ORDER_TB")


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
  
  @Id
  //@GeneratedValue
  private int id;
  private String nameString;
  private int qty;
  private double price;
  
  
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNameString() {
    return nameString;
  }
  public void setNameString(String nameString) {
    this.nameString = nameString;
  }
  public int getQty() {
    return qty;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

}
