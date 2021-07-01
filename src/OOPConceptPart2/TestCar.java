package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism -- Compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSafety();
		b.engine();
		
		System.out.println("******");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		
		System.out.println("******");
		//Top Casting
		Car c1 = new BMW(); //Child class object can be referred by parent class reference variable -- dynamic polymorphism or Run-type polymorphism
		c1.start();
		c1.stop();
		c1.refule();
		//c1.theftSafety(); //Can not call by using reference point variable of Parent class to access property of child even after creating object of child class
		
		//Down Casting
		//BMW b1 = (BMW)new Car(); //ClassCastException
	
	}

}
