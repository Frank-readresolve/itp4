package co.simplon.puzzles;

import java.util.Scanner;

/*
 * Implement the well-known palindrome puzzle (do not search for the solution on the Internet), simply search for the definition if you don't knwo what a palindrome is, not for the implementation.
 *
 * Implement the algorithm in a separate private method in the same class, the method takes the input as an argument and returns whether or not the input is a palindrome.
 *
 * User can ask for many palindromes as wished until exit.
 *
 * Examples:
 * Welcome to Palindrome puzzle.
 * Enter a word/number, I'll tell you if it's a palindrome...
 * toto
 * No! 'toto' is not a palindrome, ask for more...
 * ere
 * Yes! 'ere' is a palindrome, ask for more...
 * ére
 * No! 'ére' is not a palindrome, ask for more...
 * ErE
 * Yes! 'ErE' is a palindrome, ask for more...
 * AnA
 * Yes! 'AnA' is a palindrome, ask for more...
 * pOp
 * Yes! 'pOp' is a palindrome, ask for more...
 * 2002
 * Yes! '2002' is a palindrome, ask for more...
 * 20 02
 * Yes! '20 02' is a palindrome, ask for more...
 * exit
 * Thank you, hope it was fun.
 */
public class Palindrome {

    public static void main(String[] args) {
	System.out.println("Welcome to Palindrome puzzle.");
	System.out.println("Enter a word/number, I'll tell you if it's a palindrome...");
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
