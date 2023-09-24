package Modelo;

import java.util.*;

public class Bank {

	private ArrayList<Account> accounts;
	
	public Bank () 
	{
		
		this.setAccounts(new ArrayList<Account>());
		
	}
	
	public void deposit (int accountNumber, double sum) 
	{
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				this.accounts.get(i).deposit(sum);
				
			}
			
		}
		
	}

	public void withdraw (int accountNumber, double sum) 
	{
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				this.accounts.get(i).withdraw(sum);
				
			}
			
		}
		
	}
	
	public double getBalance (int accountNumber) 
	{
		
		double bal = 0;
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				bal = accounts.get(i).getBalance();
				return bal;
				
			}
			
		}
		
		return bal;
		
	}
	
	public void accountInOverdraft () 
	{
		
		System.out.println("The following account numbers are overdraft: ");
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getBalance() < 0) 
			{
				
				System.out.println(this.accounts.get(i).getAccountNumber());
				
			}
			
		}	
		
	}
	
	public void openAccount (char accountType, int accountNumber) 
	{
		
		if (accountType == 'A' || accountType == 'C') 
		{
		
			if (accountType == 'A') 
			{
				
				this.accounts.add(new SavingsAccount(accountNumber));
				
			}
			
			if (accountType == 'C') 
			{
				
				this.accounts.add(new CurrentAccount(accountNumber));
				
			}
			
		}else 
		
		{
			
			System.err.println("Bank.openAccount(...): " + "The account type is invalid.");
			
		}
		
	}
	
	public void closeAccount (int accountNumber) 
	{
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				System.out.println("Account number " + this.accounts.get(i).getAccountNumber() + " has been closed.");
				this.accounts.remove(i);
				
			}
			
		}
		
	}

	public ArrayList<Account> getAccounts () 
	{
		
		return accounts;
		
	}

	public void setAccounts (ArrayList<Account> accounts) 
	{
		
		this.accounts = accounts;
		
	}
	
}
