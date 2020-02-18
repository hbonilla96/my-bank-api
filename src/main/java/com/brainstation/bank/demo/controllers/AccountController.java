package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.services.AccountService;
import org.springframework.web.bind.annotation.*;

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
}
