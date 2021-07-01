package OOPConceptPart2;

public class BMW extends Car {
	
	//When same method is present in parent as well as in child class with same name and number of arguments.
	//it is called method Overriding
	public void start() {
		System.out.println("BMW car has the latest start feature");
	}
	
	public void theftSafety() {
		System.out.println("BMW has the best theft safety features");
	}

}
