package com.example.demo;

import com.example.demo.model.Refund;
import com.example.demo.model.Transaction;
import com.example.demo.model.User;
import com.example.demo.repository.RefundRepo;
import com.example.demo.repository.TransactionRepo;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Autowired
    RefundRepo refundRepo;

    @Autowired
    TransactionRepo transactionRepo;
    @Autowired
    UserRepo userRepo;
    public String addUser(User user){
        userRepo.save(user);
        return "user added succesfully";
    }
    public void addTransaction(Transaction transaction){
     transactionRepo.save(transaction);

    }
     public int succesfultransction(int userid){
      int amount=0;
      for(User user: transactionRepo.findAll()){
      if(refundRepo.existsById(userid){
          transaction.
         }
    }
}
