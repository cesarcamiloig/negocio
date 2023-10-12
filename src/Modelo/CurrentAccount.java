package Modelo;

public class CurrentAccount extends Account{
	
	private double overdraftLimit;
	
	public CurrentAccount (int a, Cliente cliente) 
	{
		
		super(a, cliente);
		this.overdraftLimit = 1000;
		
	}
	
	public void deposit (double sum) 
	{
		
		if (super.getBalance() + sum >= 0) 
		{
			
			this.overdraftLimit = 1000;
			
		}
		
		super.deposit(sum);
		
	}
	
	public void withdraw (double sum) 
	{
		
		if (super.getBalance() >= 0) 
		{
			
			if ((super.getBalance() + this.overdraftLimit) - sum >= 0) 
			{
				//this.overdraftLimit -= this.getBalance() - sum < 0 ? this.getBalance() - sum: 0;

				if (super.getBalance() - sum < 0) 
				{

					this.overdraftLimit = this.overdraftLimit + (super.getBalance() - sum);

				}
				else

				{



				}
				super.withdraw(sum);
				
				
			}else 
			
			{
				
				System.err.println("Account.withdraw(...): " + "the withdrawal exceeds the current balance plus the overdraft limit.");
				
			}
			
			
		}else 
		
		{
			
			if (this.overdraftLimit - sum >= 0 && this.overdraftLimit > 0)
			{
				
				this.overdraftLimit -= sum;
				super.withdraw(sum);
				
			}else 
				
			{
				
				System.err.println("Account.withdraw(...): " + "withdrawal exceeds overdraft limit.");
				
			}	
			
		}
		
	}

	public double getBalance () 
	{

		return super.getBalance() + this.overdraftLimit;

	}

}
