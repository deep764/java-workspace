package Module_2;

abstract class Bank 
{
    abstract int getBalance();
}

class BankA extends Bank 
{
    private int balance = 100;
    public int getBalance() 
    {
        return balance;
    }
}

class BankB extends Bank 
{
    private int balance = 150;
    public int getBalance() 
    {
        return balance;
    }
}

class BankC extends Bank 
{
    private int balance = 200;
    public int getBalance() 
    {
        return balance;
    }
}
public class Account_Bank 
{
	public static void main(String[] args) 
	{
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        
        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());
    }
}
