package model;
public class District {
	private int district_ID; //Primary key
	private String name;
	private static int count;
	
	public District() { //Default
		this.district_ID = count;
		this.name = null;
		count++;
	}
	
	public District(int District_ID, String Name) {
		this.district_ID = count;
		this.name = Name;
		count++;
	}

	public int getDistrict_ID() {
		return district_ID;
	}

	public void setDistrict_ID(int district_ID) {
		this.district_ID = district_ID;
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
		return "District [district_ID=" + district_ID + ", name=" + name + "]";
	}

}
