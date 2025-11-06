package com.sathya.conversion.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.conversion.feign.FeignClientCode;
import com.sathya.conversion.model.CurrencyExchange;
import com.sathya.conversion.model.CurrencyRequest;
import com.sathya.conversion.model.CurrencyResponse;

@Service
public class CurrencyService {

    @Autowired
    private FeignClientCode feignClient;

    public CurrencyResponse convertCurrency(CurrencyRequest request) {

        CurrencyExchange exchangeObject = feignClient.retrieveExchangeValue(
                request.getFromCurrency(), request.getToCurrency());

        double conversionRate = exchangeObject.getConversionMultiple();
        double totalAmount = request.getQuantity() * conversionRate;

        CurrencyResponse response = new CurrencyResponse();
        response.setFromCurrency(request.getFromCurrency());
        response.setToCurrency(request.getToCurrency());
        response.setQuantity(request.getQuantity());
        response.setConversionRate(conversionRate);
        response.setTotalCalculateAmount(totalAmount);
        response.setLocalDateTime(LocalDateTime.now());

        return response;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}














//
//import java.time.LocalDateTime;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sathya.conversion.feign.FeignClientCode;
//import com.sathya.conversion.model.CurrencyExchange;
//import com.sathya.conversion.model.CurrencyRequest;
//import com.sathya.conversion.model.CurrencyResponse;
//import com.sathya.conversion.repository.CurrencyRepository;
//
//
//
//@Service
//public class CurrencyService {
//	
//	
//	@Autowired
//	private FeignClientCode feignClient;
//
//    @Autowired
//    private CurrencyRepository repository;
//
//    public CurrencyResponse convertCurrency(CurrencyRequest request) {
//    	
//        CurrencyExchange exchangeObject = feignClient.retrieveExchangeValue(
//                request.getFromCurrency(), request.getToCurrency());
//
//            double conversionRate = exchangeObject.getConversionRate();
//            double totalAmount = request.getQuantity() * conversionRate;
//
//    	
//    	
//     //   double conversionRate = 86.5; // Static value for now
//   
//            
//            
////        String url = "http://localhost:8005/api/v1/exchange/from/" +
////                request.getFromCurrency() +
////                "/to/" + request.getToCurrency();
////        
////        RestTemplate restTemplate = new RestTemplate();
////		   CurrencyExchange exchangeObject = restTemplate
////		           .getForEntity(url, CurrencyExchange.class)
////		           .getBody();
////		
////		   double conversionRate = exchangeObject.getConversionRate();
////		   double totalAmount = request.getQuantity() * conversionRate;
//   
//            
//            
////    	WebClient webClient = WebClient.create("http://localhost:8005");
////    	 CurrencyExchange exchangeObject = webClient.get()
////    	            .uri("/api/v1/exchange/from/{from}/to/{to}",
////    	                 request.getFromCurrency(), request.getToCurrency())
////    	            .retrieve()
////    	            .bodyToMono(CurrencyExchange.class)
////    	            .block();
////
////    	    double conversionRate = exchangeObject.getConversionRate();
////    	    double totalAmount = request.getQuantity() * conversionRate;
//
//
//        CurrencyResponse record = new CurrencyResponse();
//        record.setFromCurrency(request.getFromCurrency());
//        record.setToCurrency(request.getToCurrency());
//        record.setQuantity(request.getQuantity());
//        record.setConversionRate(conversionRate);
//        record.setTotalCalculateAmount(totalAmount);
//        record.setLocalDateTime(LocalDateTime.now());
//
//        CurrencyResponse saved = repository.save(record);
//
//        CurrencyResponse response = new CurrencyResponse();
//        response.setId(saved.getId());
//        response.setFromCurrency(saved.getFromCurrency());
//        response.setToCurrency(saved.getToCurrency());
//        response.setQuantity(saved.getQuantity());
//        response.setConversionRate(saved.getConversionRate());
//        response.setTotalCalculateAmount(saved.getTotalCalculateAmount());
//        response.setLocalDateTime(saved.getLocalDateTime());
//
//        return response;
//    }
//}