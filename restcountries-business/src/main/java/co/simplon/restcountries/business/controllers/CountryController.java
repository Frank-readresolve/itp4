package co.simplon.restcountries.business.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.restcountries.business.dtos.CountryView;
import co.simplon.restcountries.business.services.CountryService;

@RestController
@RequestMapping("/countries")
@CrossOrigin("*")
public class CountryController {

    private final CountryService service;

    CountryController(CountryService service) {
	this.service = service;
    }

    @GetMapping
    List<CountryView> getCountryViews() {
	return service.getCountryViews();
    }
}
