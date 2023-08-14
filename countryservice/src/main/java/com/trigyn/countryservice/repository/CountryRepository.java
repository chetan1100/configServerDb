package com.trigyn.countryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trigyn.countryservice.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
