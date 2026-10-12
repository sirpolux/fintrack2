package com.project.fintrack2.account.controller;

import com.project.fintrack2.account.dto.CurrencyRequestDto;
import com.project.fintrack2.account.service.inte.CurrencyServiceInterface;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/currency")
@AllArgsConstructor
public class CurrencyController {
    private final CurrencyServiceInterface currencyService;

    @PostMapping
    public ResponseEntity<ResponseWrapper<?>> saveCurrency(CurrencyRequestDto currencyRequestDto){
        return ResponseEntity.ok(currencyService.addCurrency(currencyRequestDto));
    }
}
