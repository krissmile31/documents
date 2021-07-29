package tut2.Interface;

public class BankAccount implements Measurable {
	private String accountName;
	private double balanceNumber;
	
	public BankAccount(String accountName, double balanceNumber) {
		this.accountName = accountName;
		this.balanceNumber = balanceNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getMeasure() {
		return balanceNumber;
	}

	public void setBalanceNumber(double balanceNumber) {
		this.balanceNumber = balanceNumber;
	}

	
	
	

}
