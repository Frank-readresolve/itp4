package co.simplon.sandbox.classes;

/*
 * Define an ADT named Learner.
 * Learner: someone who learns.
 */
public class Learner {

    private static int instances = 0;

    private int otherInstances = 0;

    // instance Field of type String
    // named name
    private String name;

    // instance Field of type int
    // named age
    private int age;

    // Constructor name = class name
    public Learner() { // No return type
	instances++;
	otherInstances++;
	// No-arg constructor
	// Initializes class fields with default values
	// name = null
	// age = 0
    }

    // Constructor with arguments
    public Learner(String name, int anAge) {
	instances++;
	otherInstances++;
	// this = refers to the object
	// Initializes class fields with arguments
	// this.name = name
	// age = anAge
	this.name = name;
	this.age = anAge;
    }

    // instance Method returns the value of field name
    public String getName() {
	return name;
    }

    // instance method: not static
    public int getAge() {
	return age;
    }

    public static int getInstances() { // Static/class method (static)
	// Returns static field value
	// int age = this.age; cannot access instance/object context
	return instances;
    }

    public int getOtherInstances() { // Instance method (not static)
	// Returns instance field value
//		int countField = instances;
//		int countMethod = getInstances();
	return otherInstances;
    }
}
