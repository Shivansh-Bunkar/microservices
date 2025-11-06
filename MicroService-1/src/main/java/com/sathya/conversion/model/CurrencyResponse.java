package com.sathya.conversion.model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "currency_conversion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fromCurrency;
    private String toCurrency;
    private double quantity;
    private double conversionRate;
    private double totalCalculateAmount;
    private LocalDateTime  localDateTime ;
}
