package OOPConceptPart1;

public class Car {
	
	//Two class variables:
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car(); this is the object of Car class and a,b and c are representing these objects
		//The copies of two Global variables above will be given to each and every objects i.e mod and wheel
		//new keyword is used to create the objects
		//a,b,c are the object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2017;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel= 4;
		
		c.mod = 2012;
		c.wheel = 4;
		
		System.out.println("Before shifting the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 2010;
		System.out.println(a.mod); //2010
		c.mod = 2020;
		System.out.println(a.mod); //2020
		System.out.println(c.mod); //2020
		

	}

}
