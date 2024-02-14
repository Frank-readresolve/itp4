package co.simplon.puzzles;

import java.util.Scanner;

/*
 * Complete the puzzle with all missing Java primitives. Try to use your notes and memory first, then search the Internet.
 *
 * Each time a user enters a primitive name, the console displays information related to the type.
 *
 * Follow "byte" example output which must indicate information for the related type.
 */
public class JavaPrimitives {

    public static void main(String[] args) {
	System.out.println("Welcome to JavaPrimitives puzzle.");
	System.out.println("Enter a Java primitive type name...");
	try (Scanner in = new Scanner(System.in)) {
	    program: while (true) {
		String input = in.nextLine();
		if (input.equals("exit")) {
		    break program;
		}
		// Puzzle code here after:
		else if (input.equals("byte")) {
		    System.out.println("byte: 8-bit signed integer, default 0, min -128, max 127 (inclusive)");
		} else {
		    System.err.println("This is not a Java primitive type...");
		}
		// End of puzzle code
	    }
	}
	System.out.println("Thank you, hope it was fun.");
    }
}
