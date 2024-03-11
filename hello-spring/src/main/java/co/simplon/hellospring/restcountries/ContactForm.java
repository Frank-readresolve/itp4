package co.simplon.hellospring.restcountries;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContactForm(

	@NotBlank @Size(max = 100) String firstname,

	String lastname,

	@NotBlank

	String email, @Size(max = 1000) String comments) {
}
