package com.project.fintrack2.account.model;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Boolean existsByShortCodeAndCurrencyName(@NotNull(message = "Short code is required") String shortCode, @NotNull(message = "Currency code is required") String currencyName);
}
