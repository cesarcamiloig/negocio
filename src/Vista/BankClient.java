package Vista;

import java.util.*;

import Modelo.Bank;
import Modelo.Account;

public class BankClient {
	
	public static void main (String []args) 
	{
		
		//Scanner entrada = new Scanner(System.in);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		Bank bank = new Bank(accounts);
		
		bank.openAccount('A', 3354678);
		System.out.println("Se agrego la cuenta de ahorros: 3354678");
		bank.openAccount('A', 3359302);
		System.out.println("Se agrego la cuenta de ahorros: 3359302");
		bank.openAccount('C', 3379844);
		System.out.println("Se agrego la cuenta corriente: 3379844");
		
		System.out.println();
		System.out.println();
		
		
		bank.payDividend(3354678, 10);
		bank.payDividend(3354678, 30);
		System.out.println("Se depositaron 40 a la cuenta de ahorros: 3354678");
		
		bank.payDividend(3359302, 50);
		bank.payDividend(3359302, 50);
		System.out.println("Se depositaron 100 a la cuenta de ahorros: 3354678");
		
		bank.payDividend(3379844, 10);
		bank.payDividend(3379844, 10);
		System.out.println("Se depositaron 20 a la cuenta corriente: 3379844");
		
		System.out.println();
		System.out.println();
		
		System.out.println("La cuenta de ahorros 3354678 tiene un balance de: " + bank.getBalance(3354678));
		System.out.println("La cuenta de ahorros 3359302 tiene un balance de: " + bank.getBalance(3359302));
		System.out.println("La cuenta de ahorros 3379844 tiene un balance de: " + bank.getBalance(3379844));
		
		System.out.println();
		System.out.println();
		
		bank.withdrawAccount(3354678, 10);
		System.out.println("Se retiraron 10 a la cuenta de ahorros: 3354678");
		bank.withdrawAccount(3359302, 30);
		System.out.println("Se retiraron 30 a la cuenta de ahorros: 3354678");
		bank.withdrawAccount(3379844, 50);
		System.out.println("Se retiraron 50 a la cuenta de ahorros: 3354678");
		
		System.out.println();
		System.out.println();
		
		System.out.println("La cuenta de ahorros 3354678 tiene un balance de: " + bank.getBalance(3354678));
		System.out.println("La cuenta de ahorros 3359302 tiene un balance de: " + bank.getBalance(3359302));
		System.out.println("La cuenta de ahorros 3379844 tiene un balance de: " + bank.getBalance(3379844));
		
		System.out.println();
		System.out.println();
		
		bank.sendLetterToOverdraftAccounts();
		
		
		System.out.println();
		System.out.println();
		
		bank.closeAccount(3354678);
		bank.closeAccount(3379844);
		
		System.out.println();
		System.out.println();
		
		bank.sendLetterToOverdraftAccounts();
	}

}
