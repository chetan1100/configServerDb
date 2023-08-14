package com.trigyn.countryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trigyn.countryservice.model.Country;
import com.trigyn.countryservice.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@GetMapping("/country")
    public List<Country> getCountryList(){
        return countryService.getCountryList();
    }
	
	@PostMapping("/country")
	public Boolean addCountryDetails(Country country) {
		return countryService.saveCountryDetails(country);
	}

}
