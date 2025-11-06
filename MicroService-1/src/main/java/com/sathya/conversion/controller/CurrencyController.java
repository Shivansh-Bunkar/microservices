package com.sathya.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.conversion.model.CurrencyRequest;
import com.sathya.conversion.model.CurrencyResponse;
import com.sathya.conversion.service.CurrencyService;

@RestController
@RequestMapping("/api/v1/conversion")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @PostMapping
    public CurrencyResponse convertCurrency(@RequestBody CurrencyRequest currencyRequest) {
        return service.convertCurrency(currencyRequest);
    }
}
