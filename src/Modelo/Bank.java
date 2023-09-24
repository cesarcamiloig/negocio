package Modelo;

import java.util.*;

public class Bank {

	private ArrayList<Account> accounts;
	
	public Bank () 
	{
		
		this.setAccounts(new ArrayList<Account>());
		
	}
	
	public void deposit (Account account) 
	{
		
		
		
	}

	public void withdraw (Account account) 
	{
		
		
		
	}
	
	public double getBalance (Account account) 
	{
		
		return account.getBalance();
		
	}
	
	public void accountInOverdraft () 
	{
		
		
		
	}
	
	public void openAccount () 
	{
		
		
		
	}
	
	public void closeAccount () 
	{
		
		
		
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
