package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		
		//String to Integer Conversion
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		
		//String to Double Conversion
		String s  = "12.33";
		double d = Double.parseDouble(s);
		System.out.println(d+20);
		
		//String to Boolean conversion
		String k = "true";
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Integer to String Conversion
		int j = 200;
		System.out.println(j+2);
		String y = String.valueOf(j);
		System.out.println(y+20);
		
		String u = "100A";
		int z = Integer.parseInt(u);
		System.out.println(z+29); //Number Format Exception

	}

}
