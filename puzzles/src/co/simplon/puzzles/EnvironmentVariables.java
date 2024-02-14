package co.simplon.puzzles;

import java.util.Scanner;

/*
 * Implement an OS environment variable "printer".
 *
 * If the environment variable exists, sys out the value.
 *
 * If the environment variable does not exist, sys err "Environment variable 'input' does exist!" where "input" is the user input.
 *
 * Help : class System
 *
 * Examples (console output):
 * Welcome to EnvironmentVariables puzzle.
 * Enter an environment variable name, I will print its value...
 * toto
 * Environment variable 'toto' does exist!
 * java_home
 * C:\Program Files\Java\jdk-17.0.5+8
 * os
 * Windows_NT
 * exit
 * Thank you, hope it was fun.
 */
public class EnvironmentVariables {

    public static void main(String[] args) {
	System.out.println("Welcome to EnvironmentVariables puzzle.");
	System.out.println("Enter an environment variable name, I will print its value...");
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
