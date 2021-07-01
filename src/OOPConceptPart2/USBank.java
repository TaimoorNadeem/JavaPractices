package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100; //Static in nature, value of variable can not be changed.(Final in nature)
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Interface: Only method declaration
	//No method body - only method prototype
	//In interface we can declare the variables, variables are by default static in nature
	//Variables values can not be changed
	//No static method in interface
	//No main method in interface
	//We can not create object of interface
	//Interface are abstract in nature

}
