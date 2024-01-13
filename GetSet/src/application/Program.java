package application;

import java.util.Scanner;

import application.entities.Accounts;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		char hasInitialDeposit;
		double deposit;
		double withdraw;
		
		System.out.print("Enter account number: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		name =sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		hasInitialDeposit = sc.next().charAt(0);
		
		Accounts account = new Accounts(id, name);
		
		if(hasInitialDeposit=='y') {
			System.out.print("Enter Initial deposit value: ");
		deposit = sc.nextDouble();
		while(deposit<=0) {
			System.out.println("Invalid deposit value!");
			System.out.print("Enter Initial deposit value again: ");
			deposit=sc.nextDouble();
		}
		account.balanceDeposit(deposit); 
		}
		
		System.out.printf("%nAccount data: %n"
				+ account.toString());
				
		
		System.out.printf("%nEnter a deposit value:");
			deposit = sc.nextDouble();
			while(deposit<=0) {
				System.out.println("Invalid deposit value!");
				System.out.print("Enter Initial deposit value again: ");
				deposit=sc.nextDouble();
			}
			account.balanceDeposit(deposit);
		System.out.printf("Updated account data:%n"
				+ account.toString());
		
		
		System.out.printf("%nEnter a withdraw value:");
			withdraw = sc.nextDouble();
			while(withdraw<=0) {
				System.out.println("Invalid withdraw value!");
				System.out.print("Enter Initial withdraw value again: ");
				withdraw=sc.nextDouble();
			}
			account.balanceWithdraw(withdraw);
		System.out.printf("Updated account data:%n"
				+ account.toString());
				
		
		sc.close();
	}

}
