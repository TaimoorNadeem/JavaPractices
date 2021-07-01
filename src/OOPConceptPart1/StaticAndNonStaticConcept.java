package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Global Variables: the scope of global variables will be available across all the functions with some conditions.
	String name = "Taimoor"; //Non Static global variable
	static int age = 25; //Static variable

	public static void main(String[] args) {
		// How to call static methods and variables?
		//1. direct calling
		
		sum(); //Sum method calling
		
		//2. calling by class name
		StaticAndNonStaticConcept.sum(); //Sum method calling
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call non static methods and variables?
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		/*Can i access static methods by using objects reference? Yes, but not a good practice
		because a warning will generate to access through static way*/
		
		//obj.sum();

	}
	
	public void sendMail() { //Non static method
		System.out.println("Send Mail Method");
	}
	
	public static void sum() { //Static method
		System.out.println("Sum Method");
	}

}
