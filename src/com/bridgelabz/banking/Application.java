package com.bridgelabz.banking;
import java.util.Scanner;


public class Application {
	
	
	BankingSystem bankingSystem = new BankingSystem();
	UserInterface userInterface = new UserInterface();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Application app = new Application();
		char c;
		do {
	
		System.out.println("Welcome Banking Service");
		System.out.print("Enter your Bank Account Number:\n");
		app.bankingSystem.accountNumber = sc.nextInt();
		System.out.print("Enter your Bank Account Name:\n");
		app.bankingSystem.userName = sc.next();
		
		int input = app.userInterface.showUserMenu();
		
		switch (input) {
		
		case 1:
			System.out.println("Enter amount you want to Deposit into your Account:");
			app.bankingSystem.depositAmount = sc.nextInt();
			app.bankingSystem.deposit(app.bankingSystem.depositAmount);
			break;
		case 2:
			System.out.println("Enter amount you want to with Draw from your Account:");
			app.bankingSystem.withDrawalAmount = sc.nextInt();
			app.bankingSystem.deposit(app.bankingSystem.withDrawalAmount);
			break;
		case 3:
			System.out.println(app.bankingSystem.balance);
			break;
		case 4:
			System.out.println("Thanking you Banking with us");
			System.out.println("Welcome Again");
			System.exit(0);
			break;
		default:
			break;
			
		}
		System.out.println("Do you Want to continue(Y/N):");
		 c = sc.next().charAt(0);
			
		
	}while(c == 'Y' || c == 'y' );
	 sc.close();
				
	}

}
