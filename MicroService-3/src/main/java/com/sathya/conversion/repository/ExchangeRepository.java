package com.sathya.conversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.conversion.model.CurrencyExchange;

public interface ExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
