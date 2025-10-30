package day1;

public class Bank {
	static int currentBalance = 5000;
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to NetBanking");
	}
	
	public void deposit (int deAmount) {
		currentBalance = currentBalance + deAmount;
		System.out.println(deAmount+" rs Deposited");
	}
	public static void withdraw (int wiAmount) {
		currentBalance = currentBalance - wiAmount;
		System.out.println(wiAmount+" rs Withdrawn");
		
	}
	public int getCurrentBalance () {
		return currentBalance;
	}
	
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("Current Balance is "+bank.getCurrentBalance());
		bank.deposit(10000);
		System.out.println("Current Balance is "+bank.getCurrentBalance());
		withdraw(2000);
		System.out.println("Current Balance is "+bank.getCurrentBalance());
	}
}
