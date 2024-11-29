
public class Route {
	private int Route_ID; // Primary key
	private String Name;
	private static int count;
	
	public Route() { //Default
		this.Route_ID = count;
		this.Name = null;
		count++;
	}
	
	public Route(int Route_ID, String Name) {
		this.Route_ID = count;
		this.Name = Name;
		count++;
	}

	public int getRoute_ID() {
		return Route_ID;
	}

	public void setRoute_ID(int route_ID) {
		Route_ID = route_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static int getCount() {
		return count;
	}


	//business Logic
	public void AddStop(){

	}

	public int CalculateDistance(){
		return ;
	}

	public Vehicle GetVehiclesAssigned(){

	}



	@Override
	public String toString() {
		return "Route [Route_ID=" + Route_ID + ", Name=" + Name + "]";
	}
}
