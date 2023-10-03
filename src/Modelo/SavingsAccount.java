package modelo;

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

	public void withdraw (double sum) 
	{

		if (this.getBalance() - sum >= 0) 
		{

			super.withdraw(sum);

		} else 

		{

			System.err.println("Account.withdraw(...): " + "withdrawal exceeds account balance.");
			
		}

	}

	public void addInterest(double interest) 
	{
		
		this.interest = interest;
		
	}

}
