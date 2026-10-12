package com.project.fintrack2.account.service;

import com.project.fintrack2.account.dto.CurrencyRequestDto;
import com.project.fintrack2.account.dto.CurrencyResponseDto;
import com.project.fintrack2.account.service.inte.CurrencyServiceInterface;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.utility.response.ResponseWrapper;

import java.util.List;

public class CurrencyService implements CurrencyServiceInterface
{
    @Override
    public ResponseWrapper<CurrencyResponseDto> addCurrency(CurrencyRequestDto requestDto) {
        return null;
    }

    @Override
    public ResponseWrapper<CurrencyResponseDto> getCurrency(Long currencyId) {
        return null;
    }

    @Override
    public ResponseWrapper<List<CurrencyResponseDto>> getCurrencies(PaginationRequestDto paginationRequestDto) {
        return null;
    }

    @Override
    public ResponseWrapper<CurrencyResponseDto> updateCurrency(CurrencyRequestDto currencyRequestDto) {
        return null;
    }

    @Override
    public ResponseWrapper<String> deleteCurrency(Long currencyId) {
        return null;
    }
}
