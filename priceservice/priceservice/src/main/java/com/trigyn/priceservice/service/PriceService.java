package com.trigyn.priceservice.service;

import com.trigyn.priceservice.model.Price;
import com.trigyn.priceservice.repository.PriceServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PriceService {
	
	@Autowired
	PriceServiceRepository priceServiceRepository; 
	
    public Boolean addPriceList(List<Price> priceList){
        priceServiceRepository.saveAll(priceList);
        return true;
    }

    public List<Price> getPriceList(){
    	return priceServiceRepository.findAll();
    }
}