
public class Vehicle {
    private int vechile_ID; // Primary key
    private String type;
    private int capacity;
    private Route route; // Foreign key

    public Vehicle() { //Default
        this.type = null;
        this.capacity = 0;
        this.route = null;
    }

    public Vehicle(int vechile_ID, String type, int capacity, Route route) {
        this.vechile_ID = vechile_ID;
        this.type = type;
        this.capacity = capacity;
        this.route = route;
    }

    public int getVechile_ID() {
        return vechile_ID;
    }

    public void setVechile_ID(int Vechile_ID) {
        this.vechile_ID = Vechile_ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String Type) {
        this.type = Type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int Capacity) {
        this.capacity = Capacity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

	@Override
	public String toString() {
		return "Vehicle [Vechile_ID=" + vechile_ID + ", Type=" + type + ", Capacity=" + capacity + ", route=" + route
				+ "]";
	}
    
}
