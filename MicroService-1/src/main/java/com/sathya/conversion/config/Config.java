package com.sathya.conversion.config;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class Config {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	private String fromCurrency;
    private String toCurrency;
    private BigDecimal quantity;
    private double conversionRate;
    private double totalCalculateAmount;
    private LocalDateTime  localDateTime ;





}
