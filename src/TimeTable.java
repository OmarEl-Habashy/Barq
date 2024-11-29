public class TimeTable {
    private int Timetable_ID;
    private Route route;
    private Station station;
    private Vehicle vehicle;
    private String TimeArrival;
    private static int count=0;

    //Default Constructor
    public TimeTable() {
        Timetable_ID = count;
        this.route = null;
        this.TimeArrival = null;
        count++;
    }

   // Constructor
    public TimeTable( Route route, String timeArrival) {
        Timetable_ID = count;
        this.route = route;
        this.TimeArrival = timeArrival;
        count++;
    }

	public int getTimetable_ID() {
		return Timetable_ID;
	}

	public void setTimetable_ID(int timetable_ID) {
		Timetable_ID = timetable_ID;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getTimeArrival() {
		return TimeArrival;
	}

	public void setTimeArrival(String timeArrival) {
		TimeArrival = timeArrival;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "TimeTable [Timetable_ID=" + Timetable_ID + ", route=" + route + ", station=" + station + ", vehicle="
				+ vehicle + ", TimeArrival=" + TimeArrival + "]";
	}

}
