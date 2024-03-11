package co.simplon.hellospring;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
@CrossOrigin("*")
public class AsyncServicesController {

    @GetMapping("/weather")
    String weather() {
	// sleep();
	log("Calling /weather");
	return "Weather";
    }

    @GetMapping("/market")
    String market() {
	// sleep();
	log("Calling /market");
	return "Market";
    }

    @GetMapping("/horoscope")
    String horoscope() {
	// sleep();
	log("Calling /horoscope");
	return "Horoscope";
    }

    @GetMapping("/tweet")
    String tweet() {
	// sleep();
	log("Calling /tweet");
	return "Tweet";
    }

    private void sleep() {
	ThreadLocalRandom random = ThreadLocalRandom.current();
	long duration = random.nextLong(2, 5) * 1000;
	try {
	    Thread.sleep(duration);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    private void log(String message) {
	Thread current = Thread.currentThread();
	String threadName = current.getName();
	LocalTime time = LocalTime.now();
	System.out.println(time + " - " + threadName + " " + message);
    }
}
