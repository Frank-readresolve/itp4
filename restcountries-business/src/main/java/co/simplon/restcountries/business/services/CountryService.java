package co.simplon.restcountries.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.restcountries.business.dtos.CountryAdminView;
import co.simplon.restcountries.business.dtos.CountryCreate;
import co.simplon.restcountries.business.dtos.CountryView;
import co.simplon.restcountries.business.entities.Country;
import co.simplon.restcountries.business.repositories.CountryJpaRepository;

@Service
public class CountryService {

    private final CountryJpaRepository repository;

    public CountryService(CountryJpaRepository repository) {
	this.repository = repository;
    }

    public List<CountryView> getCountryViews() {
	return repository.findAllProjectedByOrderByCountryName();
    }

    public List<CountryAdminView> getCountryAdminViews() {
	return repository.findAllProjectedByOrderByIsoCode();
    }

    public CountryView getOne(Long id) {
	return repository.findProjectedById(id);
    }

    public void create(CountryCreate inputs) {
	// Create a new Country object
	Country country = new Country();
	// Populate the entity with the "validated" data from inputs (DTO)
	country.setCountryName(inputs.countryName());
	country.setCountryPopulation(inputs.countryPopulation());
	country.setCountryArea(inputs.countryArea());
	country.setCapitalName(inputs.capitalName());
	country.setCoatOfArmsUrl(inputs.coatOfArmsUrl());
	country.setIsoCode(inputs.isoCode());
	country.setTld(inputs.tld());
	country.setGoogleMapsUrl(inputs.googleMapsUrl());
	country.setFlagUrl(inputs.flagUrl());
	// Save/persist the new entity thanks to the repository
	repository.save(country);
    }

    public boolean existsByIsoCode(String value) {
	return repository.existsByIsoCodeIgnoreCase(value);
    }

    public boolean existsByTld(String value) {
	return repository.existsByTldIgnoreCase(value);
    }

}
