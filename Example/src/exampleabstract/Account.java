package exampleabstract;

public abstract class Account {
	
	public int accountNumber;
	public String accountHolderName;
	public int acouuntHolderAge;
	public String accountHolderAddress;
	public double amount = 0;
	
	public abstract double sumAmount(int amount);
	
	public abstract double annualIntrest(int amount);
	
	
	
	
	

}
