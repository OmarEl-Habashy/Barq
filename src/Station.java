
public class Station {
	private int station_ID; // Primary key
	private String name;
	private String location;
	private static int count;
	
	public Station() { //Default
		this.station_ID = count;
		this.name = null;
		this.location = null;
		count++;
	}
	
	public Station(int station_ID, String name, String location) {
		this.station_ID = station_ID;
		this.name = name;
		this.location = location;
	}

	public int getStation_ID() {
		return station_ID;
	}

	public void setStation_ID(int station_ID) {
		this.station_ID = station_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static int getCount() {
		return count;
	}

	//business Logic

	public void AddStationToRoute(){

	}
	public Station GetNearbyStations(){

	}

	@Override
	public String toString() {
		return "Station [station_ID=" + station_ID + ", name=" + name + ", location=" + location + "]";
	}
}
