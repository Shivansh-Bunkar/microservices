package com.sathya.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.conversion.model.CurrencyExchange;
//import com.sathya.conversion.model.CurrencyRequest;
//import com.sathya.conversion.model.CurrencyResponse;
import com.sathya.conversion.service.ExchangeService;

@RestController


@RequestMapping("/api/v1")
public class ExchangeController {

    @Autowired
    private ExchangeService service;

    @GetMapping("/exchange/from/{from}/to/{to}")
    public CurrencyExchange getExchangeValue(@PathVariable String from, @PathVariable String to) {
        return service.getExchangeValue(from, to);
    }

    @PostMapping("/exchange")
    public CurrencyExchange addExchange(@RequestBody CurrencyExchange exchange) {
        return service.saveExchange(exchange);
    }
}

