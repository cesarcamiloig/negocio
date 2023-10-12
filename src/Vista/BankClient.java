package Vista;

import java.util.*;

import Modelo.Bank;
import Modelo.CDT;
//import Modelo.Account;
//import modelo.CurrentAccount;

public class BankClient {

	public static void main (String []args) 
	{
		
		Bank bank = Bank.getInstance();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("********************************");
		System.out.println("*Bienvenido al sistema de banco*");
		System.out.println("********************************");
		
		System.out.println("");
		
		System.out.println("Por favor digite el numero de la opcion que desea realizar:");
		System.out.println("1. Abrir una cuenta de banco");
		System.out.println("2. Cerrar una cuenta de banco");
		System.out.println("3. Realizar un deposito");
		System.out.println("4. Realizar un retiro");
		System.out.println("5. Obtener balance de una cuenta");
		System.out.println("6. Conocer que cuentas se encuentran en sobregiro");
		System.out.println("7. Calcular rentabilidad (solo cuenta CDT).");
		System.out.println("8. Calcular rentabilidad de todas las cuentas CDT.");
		
		try {
		
			int numero = entrada.nextInt();
			
			boolean parar = false;
			
			while (parar == false)
				
			{
		
			if (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) 
			{
			
				if (numero == 1) 
				{
				
					System.out.println("Por favor elija el tipo de cuenta:");
					System.out.println("1. Cuenta de ahorros");
					System.out.println("2. Cuenta de corriente");
					System.out.println("3. Cuenta CDT");
				
					numero = entrada.nextInt();
					char accountType = 'X';
				
					if (numero == 1) 
					{
					
						accountType = 'A';
					
					}
				
					if (numero == 2) 
					{
					
						accountType = 'C';
					
					}

					if (numero == 3) 
					{
					
						accountType = 'T';
					
					}
				
					System.out.println("Por favor digite el numero de la nueva cuenta:");
					int accountNumber = entrada.nextInt();
				
					bank.openAccount(accountType, accountNumber);
					
					numero = 0;
				
				}
			
				if (numero == 2) 
				{
				
					System.out.println("Por favor digite el numero de la cuenta que desea cerrar:");
					int accountNumber = entrada.nextInt();
				
					bank.closeAccount(accountNumber);
					
					numero = 0;
				
				}
			
				if (numero == 3) 
				{
				
					System.out.println("Por favor digite la cantidad que desea depositar:");
					double sum = entrada.nextDouble();
				
					System.out.println("Por favor digite el numero de cuenta:");
					int accountNumber = entrada.nextInt();
				
					bank.deposit(accountNumber, sum);
					
					numero = 0;
				
				}
			
				if (numero == 4) 
				{
					
					System.out.println("Por favor digite la cantidad que desea retirar:");
					double sum = entrada.nextDouble();
				
					System.out.println("Por favor digite el numero de cuenta:");
					int accountNumber = entrada.nextInt();
				
					bank.withdraw(accountNumber, sum);
					
					numero = 0;
				
				}
			
				if (numero == 5) 
				{
				
					System.out.println("Por favor digite el numero de cuenta:");
					int accountNumber = entrada.nextInt();
				
					System.out.println("El balance de la cuenta es: " + bank.getBalance(accountNumber));
					
					numero = 0;
				
				}
			
				if (numero == 6) 
				{
				
					bank.accountInOverdraft();
					
					numero = 0;
				
				}

				if (numero == 7) 
				{

					System.out.println("Por favor digite el numero de cuenta:");
					int accountNumber = entrada.nextInt();

					if (bank.getAccount(accountNumber) instanceof CDT)
					{

						System.out.println("Por favor digite el numero de dias transcurridos:");
						int days = entrada.nextInt();
						System.out.println("La rentabilidad de la cuenta pasados " + days + " dias es: " + ((CDT)bank.getAccount(accountNumber)).calculateProfitability(days));

					} else
					{

						System.err.println("La cuenta seleccionada no es de tipo CDT.");

					}
						
					
					numero = 0;
				
				}

				if (numero == 8) 
				{

					System.out.println("Por favor digite el numero de dias para el calculo estimado.");
						int days = entrada.nextInt();
					bank.estimatedBalanceCDTAccounts(days);
				
				}
				
				System.out.println("¿Que desea hacer ahora?:");
				System.out.println("1. Salir");
				System.out.println("2. Continuar");
				
				numero = entrada.nextInt();
				
				if (numero == 1) 
				
				{
					
					parar = true;
					
				}
				
				if (numero == 2) 
					
				{
					
					System.out.println("Por favor digite el numero de la opcion que desea realizar:");
					System.out.println("1. Abrir una cuenta de banco");
					System.out.println("2. Cerrar una cuenta de banco");
					System.out.println("3. Realizar un deposito");
					System.out.println("4. Realizar un retiro");
					System.out.println("5. Obtener balance de una cuenta");
					System.out.println("6. Conocer que cuentas se encuentran en sobregiro");
					System.out.println("7. Calcular rentabilidad (solo cuenta CDT).");
					System.out.println("8. Calcular rentabilidad de todas las cuentas CDT.");
					
					numero = entrada.nextInt();
					
				}
			
			}else 
		
			{
			
			
			
			}
			
			}
		
		} catch (Exception e) 
		
		{
			
			
		}
		
	}

}
