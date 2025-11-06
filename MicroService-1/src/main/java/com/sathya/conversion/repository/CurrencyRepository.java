package com.sathya.conversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sathya.conversion.model.CurrencyResponse;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyResponse, Long> {
}
