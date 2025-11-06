package com.sathya.conversion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.conversion.model.CurrencyExchange;
import com.sathya.conversion.repository.ExchangeRepository;


@Service
public class ExchangeService {

    @Autowired
    private ExchangeRepository repository;

    public CurrencyExchange getExchangeValue(String from, String to) {
        CurrencyExchange exchange = repository.findByFromCurrencyAndToCurrency(from, to);
        if (exchange == null) {
            throw new RuntimeException("Exchange rate not found for " + from + " to " + to);
        }
        return exchange;
    }

    public CurrencyExchange saveExchange(CurrencyExchange exchange) {
        return repository.save(exchange);
    }
}
