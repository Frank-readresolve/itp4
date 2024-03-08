package co.simplon.restcountries.business.dtos.validators;

import co.simplon.restcountries.business.services.CountryService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueIsoCodeValidator implements ConstraintValidator<UniqueIsoCode, String> {

    private final CountryService service;

    public UniqueIsoCodeValidator(CountryService service) {
	this.service = service;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	System.out.println("value=" + value);
	if (value == null) {
	    return true;
	}
	return !service.existsByIsoCode(value);
    }

}
