package models;

public class Student {
	
	private String name;
	
	private double latitude;
	
	private double longitude;
	
	public Student (String name, double latitude, double longitude) {
		this.longitude = longitude;
		this.name = name;
		this.latitude = latitude;
	}
	
	/**
	 * @return name type of String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name
	 * @param name type of String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return latitude type of double
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets latitude
	 * @param latitude type of double
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return longitude type of double
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets longitude
	 * @param longitude type of double
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
