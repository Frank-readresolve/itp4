package co.simplon.sandbox.primitivetypes;

public class Application {

	public static void main(String[] args) {
		// Wrapper classes
		// Boolean booleanValue = null;
		Boolean booleanObj = Boolean.valueOf(false);
		System.out.println(booleanObj);
		Integer integerObj = Integer.valueOf(1);
		System.out.println(integerObj);
		// Since Java 5 or 8?
		// Auto boxing/unboxing
		Long longObj = 1L; // Auto boxing
		long longValue = Long.valueOf(10); // Auto unboxing
		System.out.println(longObj);
		System.out.println(longValue);
		// Beware with null for (un)boxing
//		Long fake = null;
//		long fakeValue = fake.longValue(); // Auto unboxing
//		System.out.println(fakeValue);
	}
	
	public static void primitives() {
		// Java numeric types are signed (+/-)
				// Most used primitive types (not objects):
				boolean booleanValue = true; // 1 bit
				System.out.println(booleanValue);
				int intValue = 1; // integer 32 bits
				System.out.println(intValue);
				long longValue = 1L; // integer 64 bits
				System.out.println(longValue);
				double doubleValue = 1.1; // decimal 64 bits
				System.out.println(doubleValue);
				// Less used:
				float floatValue = 1.1F; // decimal 32 bits
				System.out.println(floatValue);
				char charValue = 'a'; // integer 16 bits
				System.out.println(charValue);
				short shortValue = 1;// integer 16 bits
				System.out.println(shortValue);
				byte byteValue = 1; // integer 8 bits
				System.out.println(byteValue);
	}

}
