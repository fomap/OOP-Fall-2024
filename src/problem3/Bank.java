package problem3;

import java.util.Vector;

public class Bank {

	private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }
    public void update() 
    {
    	for (int i = 0; i < accounts.size(); i++) {
    		Account acc = accounts.get(i); 
    		if (acc instanceof SavingsAccount)
    		{
    			SavingsAccount savings = (SavingsAccount) acc;
    			savings.addInterestRate();  
    		}
    		else if (acc instanceof ChekingAccount) 
    		{
    			ChekingAccount checking = (ChekingAccount) acc;
    			
    			checking.applyFeeQuestionMark(); 
    		}
    	}
    	
    }
    
    public void openAccount(Account account) {
        accounts.add(account);
    }
	
   
    public boolean removed(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                return true;    
            }
        }
        return false; 
    }
    
    public void closeAccount(int accNumber) {
    	
    	 if (removed(accNumber))
    	 {
             System.out.println("Closed account with number: " + accNumber);
         } 
    	 else 
    	 {
             System.out.println("Account not found:");
         }
    }
    
    public void printAll() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).print();
        }
    }
    
    public static void main(String[] args) 
    {
    	Bank bank = new Bank();
        Account acc = new Account(1);
        SavingsAccount savingsAcc = new SavingsAccount(2, 12.7);
        ChekingAccount checkingAcc = new ChekingAccount(3);

        bank.openAccount(acc);
        bank.openAccount(savingsAcc);
        bank.openAccount(checkingAcc);
        
        acc.deposit(2354);
        savingsAcc.deposit(9999);
        checkingAcc.deposit(15); 
        checkingAcc.withdraw(1);
        checkingAcc.withdraw(1);
        checkingAcc.withdraw(1);
        
        bank.printAll();
        bank.update();
        bank.printAll();
        
        bank.closeAccount(2);
        
        
        bank.printAll();
    }
}
