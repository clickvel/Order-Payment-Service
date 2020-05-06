package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.common.Payment;
import com.example.common.TransactionRequest;
import com.example.common.TransactionResponse;
import com.example.entity.Order;
import com.example.repoistory.OrderRepository;

@Service
public class OrderService {
  
  @Autowired 
  private OrderRepository repository;
  
  @Autowired
  private RestTemplate template;
  
  public  TransactionResponse saveOrder(TransactionRequest request) {
    
    String response="";
    
    Order order=request.getOrder();
    Payment payment=request.getPayment();
    
    payment.setOrderID(order.getId());
    payment.setAmount(order.getPrice()) ;
    
    
    Payment paymentResponse= template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
    
    response =paymentResponse.getPaymentStatus().equals("success")?"payment processing successfull": "failure";
    
    repository.save(order);
    
    return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
    
  }
   
  

}
