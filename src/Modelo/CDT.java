package Modelo;

    public class CDT extends Account {


    //public void deposit () {}
    public CDT (int a, Cliente cliente) 
    {

        super(a, cliente);

    }

    public void withdraw (double sum) 
    {

        System.err.println("Account.withdraw(...): " + "the CDT account type is not allowed to make withdrawals.");

    }

    public double calculateProfitability (int days) 
    {

        return super.getBalance() + ((super.getBalance() * 0.01) * days);

    }

    /*
	 * Funcionalidad F1 obtener saldo de una cuenta CDT
	 */
    public double getBalance () 
    {

        return this.calculateProfitability(10);

    }

}
