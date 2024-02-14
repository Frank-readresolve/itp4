package co.simplon.puzzles;

import java.util.Scanner;

/*
 * Implement a puzzle to print a zoned date, time or date and time.
 *
 * See Java classes: ZoneId, LocalDate, LocalTime and LocalDateTime.
 *
 * First, the program asks for the type of "moment" to print. The program until a valid input.
 *
 * If the input is not either date, time or datetime, sys err "Please choose: date, time or datetime!" and the user can try again or exit.
 *
 * If the input is one of date, time or datetime as expected, sys out "Please indicate a region time zone identifier (e.g. Europe/Paris)".
 * We consider that the user inputs a valid time zone identifier, we do not handle input errors.
 *
 * Then the program outputs the current date, time or date time at the specified zone id (default toString() output), finally the program ends.
 *
 * Examples (console outputs):
 * Welcome to InteractiveDateAndTime puzzle.
 * What do you want me to print, choose: date, time or datetime?
 * datetim
 * Please choose: date, time or datetime!
 * datetimez
 * Please choose: date, time or datetime!
 * datetime
 * Please indicate a named time zone identifier (e.g. Europe/Paris)
 * America/Jamaica
 * 2024-02-14T09:28:09.410850400
 * Thank you, hope it was fun.
 */
public class InteractiveDateAndTime {

    public static void main(String[] args) {
	System.out.println("Welcome to InteractiveDateAndTime puzzle.");
	System.out.println("What do you want me to print, choose: date, time or datetime?");
	try (Scanner in = new Scanner(System.in)) {
	    program: while (true) {
		String input = in.nextLine();
		if (input.equals("exit")) {
		    break program;
		}
		// Puzzle code here after:

		// End of puzzle code
	    }
	}
	System.out.println("Thank you, hope it was fun.");
    }
}
