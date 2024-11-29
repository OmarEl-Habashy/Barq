
public class Driver {
	private int Driver_ID; // Primary key
	private String name;
	private  String contact_info;
	private static int count;

    public Driver(){ //Default
        this.name=null;
        this.contact_info=null;
        count++;
    }

   public Driver(int Driver_ID,String name,String contact_info){
       this.Driver_ID=count;
       this.name=name;
       this.contact_info=contact_info;
       count++;
   }

    public int getD_ID() {
        return Driver_ID;
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

    //business Logic
    public void AssignToRoute(){

    }
    public boolean CheckAvailability(){
        if (){
            return true;
        }
        else{
            return false;}
    }
    

	@Override
	public String toString() {
		return "Driver [Driver_ID=" + Driver_ID + ", name=" + name + ", contact_info=" + contact_info + "]";
	}

}
