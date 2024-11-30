package model;

//OMar tried to change the name of the class to Admin

public class Admin {
    private int Admin_ID; // Primary key
    private String name;
    private String password;
    private String role;
    private String contact_info;
    private static int count=0;

    



    public Admin(){ // Default
        this.Admin_ID=count;
        this.name=null;
        this.contact_info=null;
        this.password=null;
        this.role=null;
        count++;
    }

    public Admin(String name,String password,String role,String contact_info){
        this.Admin_ID=count;
        this.name=name;
        this.contact_info=contact_info;
        this.password=password;
        this.role=role;
        count++;
    }

    public int getAdmin_ID() {
        return Admin_ID;
    }
    
    public void setAdmin_ID(int admin_ID) {
        Admin_ID = admin_ID;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
    	this.role = role;
    }
    
    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public static int getCount() {
        return count;
    }

	@Override
	public String toString() {
		return "Admin [Admin_ID=" + Admin_ID + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", contact_info=" + contact_info + "]";
	}

    
}
