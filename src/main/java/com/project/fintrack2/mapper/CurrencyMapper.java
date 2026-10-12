package com.project.fintrack2.mapper;

import com.project.fintrack2.account.dto.CurrencyRequestDto;
import com.project.fintrack2.account.dto.CurrencyResponseDto;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CurrencyMapper {
    private final AuthenticationContract auth;

    public Currency toCurrency(CurrencyRequestDto requestDto){
        Currency currency = new Currency();
        currency.setCurrencyName(requestDto.getCurrencyName());
        currency.setShortCode(requestDto.getShortCode());
        currency.setStatus(requestDto.getStatus());
        return currency;
    }

    public CurrencyResponseDto toCurrencyResponseDto(Currency currency){
        return CurrencyResponseDto
                .builder()
                .currencyName(currency.getCurrencyName())
                .shortCode(currency.getShortCode())
                .status(currency.getStatus())
                .id(currency.getId())
                .build();
    }

}
