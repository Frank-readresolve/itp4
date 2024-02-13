package co.simplon.sandbox.classes;

public class Application {

    // static: class field/member
    public static String fake = "fake";

    // static: class method/member
    public static void main(String[] args) {
	System.out.println(Learner.getInstances());
	// Learner.instances = -100; because private
	for (int i = 0; i < 10; i++) {
	    Learner learner = new Learner();
	    String output = "Instances=" + Learner.getInstances() + ", Others=" + learner.getOtherInstances();
	    System.out.println(output);
	}
	System.out.println(Learner.getInstances()); // ??
    }

    public static void learners() {
	// No need to import classes from same package
	// new: instantiate a new object of type Learner
	Learner learner = new Learner("Toto", 12);
	System.out.println("Name: " + learner.getName());
	System.out.println("Age: " + learner.getAge());
	System.out.println("Instances: " + Learner.getInstances());
	System.out.println("Other Instances: " + learner.getOtherInstances());
	Learner lf = new Learner("LF", 22);
	System.out.println("Name: " + lf.getName());
	System.out.println("Age: " + lf.getAge());
	System.out.println("Instances: " + Learner.getInstances());
	System.out.println("Other Instances: " + lf.getOtherInstances());
    }

}
