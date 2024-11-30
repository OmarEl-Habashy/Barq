package model;
public class Wallet {
	private int wallet_ID; //Primary key
	private Customer customer;
	private double balance;
	private static int count;
	
	public Wallet() { //Default
		wallet_ID = count;
		this.customer = null;
		this.balance = 0.0;
		count++;
	}
	
	public Wallet(int wallet_ID, Customer customer, float balance) {
		this.wallet_ID = count;
		this.customer = customer;
		this.balance = balance;
		count++;
	}

	public int getWallet_ID() {
		return wallet_ID;
	}

	public void setWallet_ID(int wallet_ID) {
		this.wallet_ID = wallet_ID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Wallet [wallet_ID=" + wallet_ID + ", customer=" + customer + ", balance=" + balance + "]";
	}

}
