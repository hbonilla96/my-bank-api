package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import com.brainstation.bank.demo.models.FavoriteAccount;
import com.brainstation.bank.demo.services.FavoriteAccountService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/favorite")
public class FavoriteAccountController {

    private FavoriteAccountService favoriteAccountService;

    public FavoriteAccountController(FavoriteAccountService favoriteAccountService) {
        this.favoriteAccountService = favoriteAccountService;
    }

    @PostMapping
    public FavoriteAccountDTO saveFavorite(@RequestBody FavoriteAccount favoriteAccount){
        return favoriteAccountService.save(favoriteAccount);
    }
}
