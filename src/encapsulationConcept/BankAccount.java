package encapsulationConcept;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
    public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    public double getBalance() {
		return balance;
	}
    public void setBalance(double balance) {
		this.balance = balance;
	}
    public String getOwner() {
		return owner;
	}
    public void setOwner(String owner) {
		this.owner = owner;
	}
    
    public void printStatement() {
    	System.out.println("The account number is : " + accountNumber );
    	System.out.println("The account balance is : " + balance );
    	System.out.println("The account owner is : " + owner );
    }
    
//    public void deposit(double dep) {
//    	double d = getBalance() + dep;
//    System.out.println("The total balance after deposit : " + d);
//    }
    
    public void withdraw(double wit) {
    	double w = getBalance() - wit;
    	System.out.println("The total balance after withdraw : " + w);
    }
    
    public static void main(String[] args) {
	
    	BankAccount ba = new BankAccount();
    	ba.setAccountNumber("0001");
    	ba.setOwner("Malarvizhi");
    	ba.setBalance(100);
    	//ba.deposit(10);
    	ba.withdraw(10);
    	ba.printStatement();
    	

	}

}
