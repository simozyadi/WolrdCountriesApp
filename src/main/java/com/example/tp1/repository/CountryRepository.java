package com.example.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tp1.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer>{

	public Country getCountryByCountryCode(String countryCode);

}
