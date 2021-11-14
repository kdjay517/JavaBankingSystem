package com.bridgelabz.banking;

public class Users {
	
	private String userName;
	private int accountNumber;
	private int depositAmount;
	private int withDrawalAmount;
	private int balance;
	
	
	public Users(String userName, int accountNumber, int depositAmount, int withDrawalAmount, int balance) {
		super();
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.depositAmount = depositAmount;
		this.withDrawalAmount = withDrawalAmount;
		this.balance = balance;
		System.out.printf("%s",this);
	}


	@Override
	public String toString() {
		return "Users [userName=" + userName + ", accountNumber=" + accountNumber + ", depositAmount=" + depositAmount
				+ ", withDrawalAmount=" + withDrawalAmount + ", balance=" + balance + "]";
	}

		
}
