package com.shashank.ewallet.transaction.controller;


import com.shashank.ewallet.transaction.service.TransactionService;
import com.shashank.ewallet.transaction.service.resource.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/{user-id}")
    public ResponseEntity<Boolean> transaction(@PathVariable("user-id") Long userId, @RequestBody TransactionRequest transactionRequest) {
        transactionService.performTransaction(userId, transactionRequest);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
