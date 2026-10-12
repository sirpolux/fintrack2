package com.project.fintrack2.account.dto;


import com.project.fintrack2.Status;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurrencyResponseDto {
    private Long id;
    private String shortCode;
    private String currencyName;
    private String symbol;
    private Status status;
}
