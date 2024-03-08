package co.simplon.restcountries.business.dtos;

import co.simplon.restcountries.business.dtos.validators.UniqueIsoCode;
import co.simplon.restcountries.business.dtos.validators.UniqueTld;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record CountryCreate(

	// ????

	@NotBlank @Size(min = 2, max = 2) @UniqueIsoCode String isoCode,

	@NotBlank @Size(min = 1, max = 60) String countryName,

	//
	@Positive int countryPopulation,
	//
	@Positive double countryArea,

	//
	@NotBlank @Size(min = 1, max = 200) String capitalName,

	//
	@Size(min = 3, max = 3) @UniqueTld String tld,
	//
	@NotBlank @Size(min = 1, max = 40) String flagUrl,
	//
	@Size(min = 1, max = 60) String coatOfArmsUrl,
	//
	@NotBlank @Size(min = 1, max = 40) String googleMapsUrl) {

}
