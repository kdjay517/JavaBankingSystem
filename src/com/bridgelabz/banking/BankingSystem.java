package com.bridgelabz.banking;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
	
	public String userName;
	public int accountNumber;
	public int depositAmount;
	public int withDrawalAmount;
	public int balance;
	
	private List<Users> userList;
	
	public BankingSystem() {
		userList = new ArrayList<>();
	}
	
	public void add() {
		userList.add(new Users(userName,accountNumber,depositAmount,withDrawalAmount,balance));
	}
	public void deposit(int depositAmount) {
		if (depositAmount > 0)
			balance = balance + depositAmount;
		else
			System.out.println("Deposit amount is not valid.");
	}

	public void withdraw(int withDrawalAmount) {
		if (withDrawalAmount <= balance)
			balance = balance - withDrawalAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.");
	}
	
}
