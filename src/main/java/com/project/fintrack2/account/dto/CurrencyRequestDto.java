package com.project.fintrack2.account.dto;


import com.project.fintrack2.Status;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class CurrencyRequestDto {
    @NotNull(message = "Short code is required")
    private String shortCode;
    @NotNull (message = "Currency code is required")
    private String currencyName;
    @NotNull
    private String symbol;
    @NotNull
    private Status status;
}
