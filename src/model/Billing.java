package model;

import java.util.Date;

public class Billing {
	private int billing_ID;
	private Customer customer;
	private Date date;
	private String transaction_type;
	private Route route;
	private static int count=0;

    
	public Billing (){ // Default
        this.billing_ID=count;
        this.date= new Date();
        this.transaction_type=null;
        this.customer=null;
        this.route=null;
        count++;
    }

    public Billing(Customer customer, Route route, String date, String transaction_type) {
    	billing_ID = count;
        this.customer = customer;
        this.route = route;
        this.date= new Date();
        this.transaction_type=transaction_type;
        count++;

    }

    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
    	this.date = date;
    }
    
    public String getTransaction_type() {
        return transaction_type;
    }
    
    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }
    
    public int getBilling_ID() {
        return billing_ID;
    }
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public static int getCount() {
		return count;
	}
	public void setBilling_ID(int billing_ID) {
		this.billing_ID = billing_ID;
	}

	@Override
	public String toString() {
		return "Billing [billing_ID=" + billing_ID + ", customer=" + customer + ", date=" + date + ", transaction_type="
				+ transaction_type + ", route=" + route + "]";
	}

}
