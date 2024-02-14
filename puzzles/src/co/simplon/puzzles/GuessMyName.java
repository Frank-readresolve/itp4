package co.simplon.puzzles;

import java.util.Scanner;

public class GuessMyName {

    public static void main(String[] args) {
	// A welcome message in the console:
	System.out.println("Welcome to GuessMyName puzzle.");
	System.out.println("Try to guess my name...");
	// Try-with: open a new scanner and close it when program ends
	try (Scanner in = new Scanner(System.in)) {
	    program: while (true) {
		// Wait until a new line is entered in the console:
		String input = in.nextLine();
		// Code below executes when user press enter
		// Exit program if line is esqual to exit
		if (input.equals("exit")) {
		    break program;
		}
		// Puzzle code here after:
		else if (input.equals("Frank")) {
		    System.out.println("You got it! Weldone!");
		    break program;
		} else {
		    System.err.println("No! Try again...");
		}
		// End of puzzle code
	    }
	}
	// Scanner is closed
	System.out.println("Thank you, hope it was fun.");
	// End of program, exiting Java program
    }

}
