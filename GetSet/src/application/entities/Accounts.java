package application.entities;

import java.util.Scanner;

public class Accounts {
	private int id;
	private String name;
	private double balance;
	
	public Accounts(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public double balanceDeposit(double deposit) {
		
		return balance+=deposit;
	}
	
	public double balanceWithdraw(double withdraw) {
		return balance-=(withdraw+5);
	}	
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n",getId(),getName(),getBalance());
	}
}
