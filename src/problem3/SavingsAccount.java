package problem3;

public class SavingsAccount extends Account{

	private double interestRate;
	
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
		
	}

	public double getInterestRate()
	{
		return interestRate;
	}
	
	
	public void addInterestRate()
	{
		 double interest = getBalance() * (interestRate / 100);
	     deposit(interest);
	}
	
	public String toString()
	{
		String res = "";
		res = String.format("Account number: %d, balance %.2f and interest rate of %.2f", getAccountNumber(), getBalance(), getInterestRate());		
		return res;
		
	}
	
}
