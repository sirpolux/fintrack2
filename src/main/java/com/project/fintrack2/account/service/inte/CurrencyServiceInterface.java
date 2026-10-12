package com.project.fintrack2.account.service.inte;

import com.project.fintrack2.account.dto.CurrencyRequestDto;
import com.project.fintrack2.account.dto.CurrencyResponseDto;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.utility.response.ResponseWrapper;

import java.util.List;

public interface CurrencyServiceInterface {
    ResponseWrapper<CurrencyResponseDto> addCurrency(CurrencyRequestDto requestDto);
    ResponseWrapper<CurrencyResponseDto> getCurrency(Long currencyId);
    ResponseWrapper<List<CurrencyResponseDto>> getCurrencies(PaginationRequestDto paginationRequestDto);
    ResponseWrapper<CurrencyResponseDto> updateCurrency(CurrencyRequestDto currencyRequestDto);
    ResponseWrapper<String> deleteCurrency(Long currencyId);
}
