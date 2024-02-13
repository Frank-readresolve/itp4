package co.simplon.sandbox.strings;
// java.lang imported by default
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		String[] asArray = "1,2,3".split(",");
		String arrayAsString = Arrays.toString(asArray);
		System.out.println(arrayAsString);
		String strA = "Hello ";
		String strB = "world!";
		// Operator "+" overloaded: math or concat
		// Limit string concatenation!
		System.out.println(strA + strB);
		
	}
	
	public static void comparison() {
		String strA = "Hello";
		String strB = "Hello";
		// Never use new String
		String strC = new String("Hello");
		// Never compare objects with ==
		System.out.println(strA == strB);
		System.out.println(strA == strC);
		// Always use equals to compare objects
		System.out.println(strA.equals(strC));
	}

}
