package com.example.tp1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tp1.model.Country;
import com.example.tp1.repository.CountryRepository;

@Service
public class CountryService {

	private CountryRepository countryRepository;

	@Autowired
	public CountryService(CountryRepository countryRepository) {
		super();
		this.countryRepository = countryRepository;
	}
	
	public List<Country> getallCountry() {
		List<Country> listCountry = new ArrayList<>();
		Iterable<Country> iterable = countryRepository.findAll();
		iterable.forEach(listCountry::add);
		return listCountry;
	}

	public Country getCountryByCode(String code) {
		// TODO Auto-generated method stub
		return this.countryRepository.getCountryByCountryCode(code);
	}
}
