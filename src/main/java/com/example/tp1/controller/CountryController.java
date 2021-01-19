package com.example.tp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp1.model.Country;
import com.example.tp1.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping
	@RequestMapping("/all")
	public List<Country> getAll() {
	  return countryService.getallCountry();
	}
	
	@GetMapping
	@RequestMapping("/{code}")
	@ResponseBody
	public Country getCountryByCode(@PathVariable String code) {
		return countryService.getCountryByCode(code);
	}
	
	/*
	@GetMapping
	@RequestMapping("/country")
	@ResponseBody
	public Country getCountryByCodeRequestParam(@RequestParam String code) {
		return countryService.getCountryByCode(code);
	} */
	
}
