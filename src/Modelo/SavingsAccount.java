package Modelo;

public class SavingsAccount extends Account{
	
	private double interest;

	public SavingsAccount (int a) 
	{
		
		super(a);
		this.interest = 0.1;
		
	}
	
	public void deposit (double sum) 
	{
		
		sum += (this.getBalance() * this.interest);
		super.deposit(sum);
		
	}

	public void addInterest(double interest) 
	{
		
		this.interest = interest;
		
	}

}
