package com.example.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;

@Service
public class PaymentService {
  
  @Autowired
  private PaymentRepository repository;
  
  
  public Payment doPayment(Payment payment)
  {
    
    payment.setPaymentStatus(paymentProcession());
    payment.setTransactionId(UUID.randomUUID().toString());
    return repository.save(payment);
  }
 
  public String paymentProcession()
  {
    return new Random().nextBoolean()?"success":"false";
  }

  public Payment findPaymentHistoryByOrderID(int orderID) {
    
    return repository.findByOrderID(orderID);
  }

}
