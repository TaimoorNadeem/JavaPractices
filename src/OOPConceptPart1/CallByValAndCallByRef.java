package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 25; //25 will remain for x
		int y = 75; //75 will remain for y
		obj.testSum(x, y); //Call By Value/Pass By Value
		
		obj.p = 30;
		obj.q = 90;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q); //After swapping

	}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	//Call By reference
	public void swap(CallByValAndCallByRef t) {
		
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q;  //t.p = 90
		t.q = temp; //t.q = 30
	}

}
