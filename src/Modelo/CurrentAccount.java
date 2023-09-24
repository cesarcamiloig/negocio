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
		
		if ((this.getBalance() + this.overdraftLimit) - sum > 0) 
		{
			
			super.withdraw(sum);

			
		}else
		
		{
			
			System.err.println("Account.withdraw(...): " + "The withdrawal exceeds the current balance plus the overdraft limit");
			
		}
		
	}

}
