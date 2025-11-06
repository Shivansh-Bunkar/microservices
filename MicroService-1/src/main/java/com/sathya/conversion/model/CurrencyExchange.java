package com.sathya.conversion.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class CurrencyExchange {

    @Id
   
    private Long id;
    private String fromCurrency;
    private String toCurrency;
    
    @JsonProperty("conversionMultiple")
    private double conversionMultiple;
   }
