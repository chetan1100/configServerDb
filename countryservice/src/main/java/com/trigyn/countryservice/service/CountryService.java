package com.trigyn.countryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trigyn.countryservice.model.Country;
import com.trigyn.countryservice.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;
	
	public List<Country> getCountryList(){
    	return countryRepository.findAll();
    }

	public Boolean saveCountryDetails(Country country) {
		countryRepository.save(country);
		return true;
	}
}
