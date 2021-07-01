package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
			
		MethodOverloading obj = new MethodOverloading();
		obj.Sum();
		obj.Sum(10);
		obj.Sum(10, 15);
		
	}
	
	public static void main(int q) {
		
	}
	
	public static void main(int x, int y) {
		
	}
	//Yes, we can overload main method also.
	//You can not create a method inside a method. It is not allowed
	//duplicate methods -- i.e same method name with same number of arguments and with same data types are not allowed
	
	//Method overloading --> When the method name is same with different arguments or input parameters within the same class
	public void Sum() { //Zero Input parameter
		System.out.println("SUM method --> Zero parameters");
	}
	
	public void Sum(int i) { //One input parameter
		
		System.out.println("SUM method --> One parameters");
		System.out.println(i);
	}
	
	public void Sum(int K, int L) { //SUM method --> Two parameters
		System.out.println("SUM method --> Three parameters");
		System.out.println(K+L);
	}

}
