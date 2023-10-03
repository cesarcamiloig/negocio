package modelo;

    public class CDT extends Account {


    //public void deposit () {}
    public CDT (int a) 
    {

        super(a);

    }

    public void withdraw (double sum) 
    {

        System.err.println("Account.withdraw(...): " + "the CDT account type is not allowed to make withdrawals.");

    }

    public double calculateProfitability (int days) 
    {

        return this.getBalance() + ((this.getBalance() * 0.01) * days);

    }

}
