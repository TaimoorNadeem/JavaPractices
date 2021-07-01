package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variables or class variables
	String name = "Taimoor";
	int age = 29;

	public static void main(String[] args) {
		
		int i = 10; //local variables for main method
		
		System.out.println(i);
		//Can not access your global variables here
		
		LocalVsGlobalVariables v = new LocalVsGlobalVariables();
		System.out.println(v.name);
		System.out.println(v.age);
		v.sum();
		
	}
	
	public void sum() {
		int i = 15; //local variables for Sum method
		int j = 20;
		int age = 25;
		System.out.println(i+j+age);
	}

}
