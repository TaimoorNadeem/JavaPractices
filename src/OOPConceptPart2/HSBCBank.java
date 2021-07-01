package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { //We are acheiving multiple inheritance
	//is-a relationship
	
	
	//If a class is implementing any interface, then it is mendatory to define/override all the method of interface.
	//First three methods are overriding from US Bank
	//Fourth method is overriding from Brazil Bank
	public void credit() {
		
		System.out.println("HSBC--credit");
		
	}
	
	public void debit() {
		
		System.out.println("HSBC--debit");
		
	}
	
	public void transferMoney() {
		
		System.out.println("HSBC--transferMoney");
	}
	
	public void mutualFund() {
		
		System.out.println("HSBC--mutualFund");
	}
	
	public void educationLoan() {
		
		System.out.println("HSBC--educationLoan");
	}
	
public void carLoan() {
		
		System.out.println("HSBC--carLoan");
	}

}
