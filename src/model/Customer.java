package model;

public class Customer {
	private int customer_ID; // Primary key
	private String password;
	private String contact_info;
	private Wallet wallet; //Foreign key
	private int count;
	
	public Customer() { //Default
		this.customer_ID = count;
		this.password = null;
		this.contact_info = null;
		this.wallet = null;
		count++;
	}
	
	public Customer(int customer_ID, String password, String contact_info, Wallet wallet) {
		this.customer_ID = customer_ID;
		this.password = password;
		this.contact_info = contact_info;
		this.wallet = wallet;
	}

	public int getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	// public String getPassword() {
	// 	return password;
	// }

	// public void setPassword(String password) {
	// 	this.password = password;
	// }

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Customer [customer_ID=" + customer_ID + ", contact_info=" + contact_info
				+ ", wallet=" + wallet + ", count=" + count + "]";
	}
	
}
