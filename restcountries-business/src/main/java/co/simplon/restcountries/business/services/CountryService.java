package co.simplon.restcountries.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.restcountries.business.dtos.CountryView;

@Service
public class CountryService {

    public List<CountryView> getCountryViews() {
	return List.of(new CountryView("French Republic", "Paris", 67391582, "https://flagcdn.com/w320/fr.png"),
		new CountryView("Republic of Cyprus", "Nicosia", 1207361, "https://flagcdn.com/w320/cy.png"),
		new CountryView("Republic of Serbia", "Belgrade", 6908224, "https://flagcdn.com/w320/rs.png"));
    }

}
