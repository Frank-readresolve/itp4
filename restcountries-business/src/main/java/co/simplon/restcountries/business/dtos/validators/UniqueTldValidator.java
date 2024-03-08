package co.simplon.restcountries.business.dtos.validators;

import co.simplon.restcountries.business.services.CountryService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueTldValidator implements ConstraintValidator<UniqueTld, String> {

    private final CountryService service;

    public UniqueTldValidator(CountryService service) {
	this.service = service;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	System.out.println("value=" + value);
	if (null == value) {
	    return true;
	}
	return !service.existsByTld(value);
    }

}
