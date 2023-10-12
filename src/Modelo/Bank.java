package Modelo;

import java.util.*;

public class Bank {

	private static Bank instance;
	private ArrayList<Account> accounts;
	
	private Bank () 
	{
		
		this.accounts = new ArrayList<Account>();
		
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
		
		if (this.getIndex(accountNumber) == -1) 
		{
			
			System.err.println("Bank.deposit(...): " + "There is no account with that number.");
			
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
		
		if (this.getIndex(accountNumber) == -1) 
		{
			
			System.err.println("Bank.withdraw(...): " + "There is no account with that number.");
			
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
		
		if (this.getIndex(accountNumber) == -1) 
		{
			
			System.err.println("Bank.getBalance(...): " + "There is no account with that number.");
			
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
	
	public void openAccount (char accountType, int accountNumber, Cliente cliente) 
	{
		
		if ((accountType == 'A' || accountType == 'C' || accountType == 'T') && this.getIndex(accountNumber) == -1) 
		{
		
			if (accountType == 'A') 
			{
				
				this.accounts.add(new SavingsAccount(accountNumber, cliente));
				
			}
			
			if (accountType == 'C') 
			{
				
				this.accounts.add(new CurrentAccount(accountNumber, cliente));
				
			}

			if (accountType == 'T') 
			{
				
				this.accounts.add(new CDT(accountNumber, cliente));
				
			}
			
			System.out.println("Successfully opened account");
			
		}else 
		
		{
			
			System.err.println("Bank.openAccount(...): " + "The account type is invalid or the account already exists.");
			
		}
		
	}
	
	public void closeAccount (int accountNumber) 
	{
		
		if (this.getIndex(accountNumber) == -1) 
		{
			
			System.err.println("Bank.closeAccount(...): " + "There is no account with that number.");
			
		}
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				System.out.println("Account number " + this.accounts.get(i).getAccountNumber() + " has been closed.");
				this.accounts.remove(i);
				
			}
			
		}
		
	}
	
	private int getIndex (int accountNumber) 
	{
		
		int index = -1;
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i).getAccountNumber() == accountNumber) 
			{
				
				index = i;
				
			}
			
		}
		
		return index;
		
	}

	public Account getAccount (int accountNumber) 
	{

		for (int i = 0; i < this.accounts.size(); i++) 
		{

			if (this.accounts.get(i).getAccountNumber() == accountNumber) {

				return this.accounts.get(i);

			}

		}
		return null;

	}

	public void estimatedBalanceCDTAccounts (int days) 
	{

		System.out.println("The estimated balance for the following CDT accounts is: ");
		
		for (int i = 0; i < this.accounts.size(); i++) 
		{
			
			if (this.accounts.get(i) instanceof CDT) 
			{
				int accountNumber = this.accounts.get(i).getAccountNumber();
				System.out.println("La cuenta de numero " + accountNumber + ", tiene una rentabilidad estimada de: " + ((CDT)getAccount(accountNumber)).calculateProfitability(days));
				
			}
			
		}

	}

	/*
	 * Funcionalidad F4 imprimir numero y nombre del cliente de una cuenta de bank;
	 */
	public void imprimirNumeroCuentaYNombre () 
	{

		System.out.println("A continuacion se imprime el numero de cuenta y nombre del cliente asociado a esta.");
		for (int i = 0; i < this.accounts.size(); i++) 
		{

			System.out.println("Numero de cuenta y nombre completo respectivamente: " + this.accounts.get(i).getAccountNumber() + ", " + this.accounts.get(i).getCliente().getNombresApellidos());
			
		}

	}

	/*
	 * Funcionalidad F2 imprimir numero y saldo de una cuenta de bank;
	 */
	public void imprimirNumeroCuentaYSaldo () 
	{

		System.out.println("A continuacion se imprime el numero de cuenta y el saldo de esta.");
		for (int i = 0; i < this.accounts.size(); i++) 
		{

			System.out.println("Numero de cuenta y saldo respectivamente: " + this.accounts.get(i).getAccountNumber() + ", " + this.accounts.get(i).getBalance());
			
		}

	}
	
	public static Bank getInstance () 
	{
		
		if (instance == null) 
		{
			
			instance = new Bank();
			
		}
		
		return instance;
		
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
