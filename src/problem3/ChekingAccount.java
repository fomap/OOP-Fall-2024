package problem3;

public class ChekingAccount extends Account {
	
	private int cntOfTransactions;
	private int FREE_TRANSACTIONS = 2;
	
	public ChekingAccount(int accNumber) {
		super(accNumber);
		cntOfTransactions = 0;
	}

	public void deposit(double sum) 
	{ 
		super.deposit(sum); 
		cntOfTransactions++;
        applyFeeQuestionMark(); 
		
	}
	
	public int getCntOfTransactions()
	{
		return cntOfTransactions;
	}

	public void withdraw(double sum) 
	{
		 if (sum <= getBalance()) {
			 super.withdraw(sum);  
	         cntOfTransactions++;
	         applyFeeQuestionMark(); 
	     }
		 else
	     {
	         System.out.println("Not enought money for withdrawal! :( ");
	     }
	}

	public void applyFeeQuestionMark() {
		  if (cntOfTransactions > FREE_TRANSACTIONS) {
			  if (getBalance() >= 0.02) 
			  {
				  super.withdraw(0.02);
	          }
			  else
			  {
	              System.out.println("Not enought money to take transaction fee.");
	          }
	       }
	    }
	
	public String toString() {
        return String.format("Account number: %d, balance %.2f and number of transactions: %d",getAccountNumber(), getBalance(), getCntOfTransactions());
    }
	
}
