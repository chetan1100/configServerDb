package com.trigyn.countryservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countryservice")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double gdp;
	private Double inflation;
	private String country;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getGdp() {
		return gdp;
	}
	public void setGdp(Double gdp) {
		this.gdp = gdp;
	}
	public Double getInflation() {
		return inflation;
	}
	public void setInflation(Double inflation) {
		this.inflation = inflation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", gdp=" + gdp + ", inflation=" + inflation + ", country=" + country + "]";
	}


}
