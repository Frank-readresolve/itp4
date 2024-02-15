package co.simplon.hellospring;

import java.time.LocalDate;

public record Person(String firstname, String lastname, LocalDate birthDate) {

}
