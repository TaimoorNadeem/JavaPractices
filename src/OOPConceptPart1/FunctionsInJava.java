package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object.
		//We never return a value from main method, that's why it's data type will be void always.
		obj.test();
		System.out.println(obj.pqr());
		String s = obj.qa();
		System.out.println(s);
		int res = obj.division(10, 2);
		System.out.println(res);
	}
	
	//non static methods
	//void -- does not return any value
	
	//return type = void
	public void test() { //no input, no output
		System.out.println("Test Method"); 
	}
	
	//return type = int
	public int pqr() { //no input but getting output
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() { //no input but getting some output
		System.out.println("QA Method");
		String s = "Selenium";
		
		return s;
	}
	
	//x, y input parameters/arguments
	//return type = int
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
	}

}
