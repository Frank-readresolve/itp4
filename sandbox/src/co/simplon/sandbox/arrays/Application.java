package co.simplon.sandbox.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		// Java array are "static" (not dynamic)
		// Java array are typed like any other variables
		String[] students = new String[3];
		students[0] = "Rika";
		students[1] = "David";
		System.out.println(Arrays.toString(students));
		System.out.println(students.length);
		students[2] = "LF";
		System.out.println(Arrays.toString(students));
		System.out.println(students.length);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// students[3] = "Boom";
		String[] languages = {"Java", "JavaScript", null};
		System.out.println(Arrays.toString(languages));
	}

}
