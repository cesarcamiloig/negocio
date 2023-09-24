package Modelo;

public class CurrentAccount extends Account{
	
	private double overdraftLimit;
	
	public CurrentAccount (int a, double overdraftLimit) 
	{
		
		super(a);
		this.overdraftLimit = overdraftLimit;
		
	}
	
	public void withdraw (double sum) 
	{
		
		
		
	}

}
