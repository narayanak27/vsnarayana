package july14;

public class BankAccount {
	private String coustomerName;
	private double accountNumber;
	private double balance;
	
	
	public BankAccount(String coustomerName, double accountNumber, double balance) {
		super();
		this.coustomerName = coustomerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getCoustomerName() {
		return coustomerName;
	}
	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "coustomerName=" + coustomerName + ", accountNumber=" + accountNumber + ", balance="
				+ balance ;
	}
	
	
	

}

