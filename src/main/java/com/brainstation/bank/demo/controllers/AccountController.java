package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public String createAccount(@RequestBody Account account){
        return accountService.generateAccountNumber(account);
    }

    @GetMapping("/{id}")
    public List listAccountByUser(@PathVariable("id") int id){
        return accountService.getAccountByUser(id);
    }

    @GetMapping("/{accountNumber}/{userName}")
    public List listAccountByUserName(@PathVariable("accountNumber") String accountNumber, @PathVariable("userName") String userName){
        return accountService.getAccountByUserName(accountNumber,userName);
    }
}
