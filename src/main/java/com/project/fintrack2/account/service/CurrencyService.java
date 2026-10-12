package com.project.fintrack2.account.service;

import com.project.fintrack2.account.dto.CurrencyRequestDto;
import com.project.fintrack2.account.dto.CurrencyResponseDto;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.account.model.CurrencyRepository;
import com.project.fintrack2.account.service.inte.CurrencyServiceInterface;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.exception.CurrencyAlreadyExistsException;
import com.project.fintrack2.exception.ResourceNotFoundException;
import com.project.fintrack2.mapper.CurrencyMapper;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CurrencyService implements CurrencyServiceInterface
{
    private final CurrencyMapper currencyMapper;
    private final AuthenticationContract auth;
    private final CurrencyRepository currencyRepository;

    @Override
    public ResponseWrapper<CurrencyResponseDto> addCurrency(CurrencyRequestDto requestDto) {
        User user =  auth.getAuthenticatedUser();
        Currency currency = currencyMapper.toCurrency(requestDto);
        currency.setAddedBy(user);
        Boolean currencyExists =  currencyRepository.existsByShortCodeAndCurrencyName(requestDto.getShortCode(), requestDto.getCurrencyName());
        if (currencyExists){
            throw new CurrencyAlreadyExistsException("Currency already exists");
        }
        Currency createdCurrency = currencyRepository.save(currency);
        return ResponseWrapper.success("Currency added",currencyMapper.toCurrencyResponseDto(currency), HttpStatus.OK);

    }

    @Override
    public ResponseWrapper<CurrencyResponseDto> getCurrency(Long currencyId) {
        Optional<Currency>  currency = currencyRepository.findById(currencyId);
        if (currency.isEmpty()){
            throw new ResourceNotFoundException("Resource not found "+ "Currency");
        }
        Currency selectedCurrency = currency.get();
        return ResponseWrapper.success("Fetched Currency", currencyMapper.toCurrencyResponseDto(selectedCurrency), HttpStatus.OK);
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
