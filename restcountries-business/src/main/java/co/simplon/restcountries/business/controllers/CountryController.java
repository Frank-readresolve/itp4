package co.simplon.restcountries.business.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.restcountries.business.dtos.CountryAdminView;
import co.simplon.restcountries.business.dtos.CountryCreate;
import co.simplon.restcountries.business.dtos.CountryView;
import co.simplon.restcountries.business.services.CountryService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/countries")
@CrossOrigin("*")
public class CountryController {

    private final CountryService service;

    CountryController(CountryService service) {
	this.service = service;
    }

    @PostMapping
    void create(@RequestBody @Valid CountryCreate inputs) {
	service.create(inputs);
    }

    @GetMapping
    List<CountryView> getCountryViews() {
	return service.getCountryViews();
    }

    @GetMapping("/admin")
    List<CountryAdminView> getCountryAdminViews() {
	return service.getCountryAdminViews();
    }

    @GetMapping("/{id}")
    CountryView getOne(@PathVariable("id") Long id) {
	return service.getOne(id);
    }

}
