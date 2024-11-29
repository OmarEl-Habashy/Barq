import java.util.Date;

public class Ticket {
    private int ticket_ID;
    private Date date_issuesd;
    private float price;
    private String type;
    private static int count=0;

    //Default Constructor
    public Ticket(){
    	ticket_ID=count;
        float price = Float.NaN; // Special value for "not a number"
        this.type=null;
        this.date_issuesd=null;
        count++;
    }

    //Constructor
    public Ticket(int ticket_ID, Date date_issuesd, float price, String type) {
    	this.ticket_ID = count;
    	this.date_issuesd = date_issuesd;
        this.price = price;
        this.type = type;
        count++;
    }

	public int getTicket_ID() {
		return ticket_ID;
	}

	public void setTicket_ID(int ticket_ID) {
		this.ticket_ID = ticket_ID;
	}

	public Date getDate_issuesd() {
		return date_issuesd;
	}

	public void setDate_issuesd(Date date_issuesd) {
		this.date_issuesd = date_issuesd;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Ticket [ticket_ID=" + ticket_ID + ", date_issuesd=" + date_issuesd + ", price=" + price + ", type="
				+ type + "]";
	}
	
}
