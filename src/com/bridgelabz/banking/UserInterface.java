package com.bridgelabz.banking;

import java.util.Scanner;

public class UserInterface {
	
	public int showUserMenu() {
		System.out.println("Enter \n1. Deposit \n2. WithDrawl \n3. Balance \n4. Exit");
		Scanner sc = new Scanner(System.in) ;
		int input = sc.nextInt();
		return input;
	
	}

}
