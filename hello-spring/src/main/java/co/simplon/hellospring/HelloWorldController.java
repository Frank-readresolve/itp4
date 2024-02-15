package co.simplon.hellospring;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    String hello() {
	return "Hello Cadre du printemps";
    }

    @GetMapping("/coucou")
    String coucou() {
	return "Coucou Botte de printemps";
    }

    @PostMapping("/print/{word}")
    void print(@PathVariable("word") String word) {
	System.out.println(word);
    }

    @GetMapping("/person")
    Person person() {
	LocalDate date = LocalDate.of(2021, 1, 1);
	Person person = new Person("Frank", "MARSHALL", date);
	return person;
    }

    @PostMapping("/person")
    void person(@RequestBody Person person) {
	System.out.println(person);
    }
}
