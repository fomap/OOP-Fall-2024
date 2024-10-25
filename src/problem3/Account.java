package problem3;

public class Account {

	private double balance; 
	private int accNumber; 

	public Account(int accNumber){
		balance = 0.0;
		this.accNumber = accNumber;
	}
	public void deposit(double sum) 
	{ 
		balance += sum;
	}
	public void withdraw(double sum) 
	{
		if (sum <= balance)
		{
			balance -= sum;
		}
	}
	public double getBalance()
	{
		 return balance;
	}
	public int getAccountNumber() 
	{
		return accNumber;
	}
	public void transfer(double amount, Account other)
	{
		if(amount <= balance)
		{
			this.withdraw(amount);
			other.deposit(amount);
		}
		
	}
	
	public String toString()
	{
		String res = "";
		res = String.format("Account number: %d, balance %.2f", getAccountNumber(), getBalance());		
		return res;
		
	}
	public void print() {

		System.out.println(toString());
	}
	
	
}
