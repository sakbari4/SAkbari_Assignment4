package application;
/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Management Company
 * Due: MM/DD/YYYY
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sama Akbari
*/

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;

	public Property(String propertyName, String city, double rentAmount, String owner, Plot plot) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = plot;
	}
	
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,width,depth);
	}

	//Getter
	public String getPropertyName() {
		return propertyName;
	}

	public String getCity() {
		return city;
	}

	public double getRentalAmount() {
		return rentAmount;
	}

	public String getOwner() {
		return owner;
	}

	public Plot getPlot() {
		return plot;
	}
	
	//Setter
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setRentalAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public String toString() {
		return String.format
		("%s,%s,%s,%,$.2f", propertyName, city, owner, rentAmount);
	}
}
