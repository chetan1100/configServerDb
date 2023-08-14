package com.trigyn.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trigyn.priceservice.model.Price;

public interface PriceServiceRepository extends JpaRepository<Price, Long>{

}
