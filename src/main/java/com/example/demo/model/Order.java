package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Order {
  private long id;
  private String email;
  private String subject;
  private double price;
}
