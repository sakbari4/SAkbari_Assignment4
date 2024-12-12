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
public class ManagementCompany {
	private String name, taxId;
	private double managementFee;
	private final int MAX_PROPERTY = 5;
	private static final int MGMT_WIDTH = 10;
	private static final int MGMT_DEPTH = 10;
	private Property[] properties = new Property[getMAX_PROPERTY()];
	private Plot plot;
	private int numberOfProperties = 0;
	    
	// Constructor
	public ManagementCompany(String name, String taxId, double managementFee) {
		this.name = name;       
		this.taxId = taxId;     
		this.managementFee = managementFee;     
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH); 
	}
	
	public ManagementCompany() {
		this.name = "";
		this.taxId = "";
		this.managementFee = 0;
		this.properties = new Property [getMAX_PROPERTY()];
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.numberOfProperties = 0;
	}
 
	// Getters and setters   
	public String getName() { 
		return name; 
	}   
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public String getTaxId() { 
		return taxId; 
	}
	
	public void setTaxId(String taxId) { 
		this.taxId = taxId; 
	}
	
	public double getManagementFee() { 
		return managementFee; 
	}
	
	public void setManagementFee(double managementFee) { 
		this.managementFee = managementFee; 
	}
	
	public int getNumberOfProperties() { 
		return numberOfProperties; 
	}

	// Method to add a property    
	public int addProperty(Property property) {    
		if (property == null) {
			return -2;   
		}
		if (numberOfProperties >= getMAX_PROPERTY()) {
			return -1;   
		}
		if (!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for (int i = 0; i < numberOfProperties; i++) { 	
			if (properties[i].getPlot().overlaps(property.getPlot())) return -4;
		}

		properties[numberOfProperties++] = property;

		return numberOfProperties - 1;
	}

	// Method to calculate total rent 
	public double getTotalRent() {
		double totalRent = 0;
		for (int i = 0; i < numberOfProperties; i++) {
			totalRent += properties[i].getRentalAmount();
		}
		
		return totalRent;
	}

	// Method to get the highest rent property
	public Property getHighestRentProperty() {
		Property highestRentProperty = properties[0];
		for (int i = 1; i < numberOfProperties; i++) {
	      	if (properties[i].getRentalAmount() > highestRentProperty.getRentalAmount()) {
	      		highestRentProperty = properties[i];
	 
	        }
	      
	    }
	    return highestRentProperty;
	 }

	// Method to remove last property
	public void removeLastProperty() {
		if (numberOfProperties > 0) {
			properties[--numberOfProperties] = null;
	    }
	}

	// Method to check if properties array is full
	public boolean isPropertiesFull() {
	    return numberOfProperties == getMAX_PROPERTY();
	}

	// Method to check if management fee is valid
	public boolean isManagementFeeValid() {
		return managementFee >= 0 && managementFee <= 100;
	}

	// toString method to represent all properties
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("List of the properties for ").append(name).append(", taxID: ").append(taxId).append("\n");
	    sb.append("______________________________________________________\n");

	    for (int i = 0; i < numberOfProperties; i++) {
	        sb.append(properties[i].toString()).append("\n");
	    }

	    sb.append("______________________________________________________\n");
	    sb.append(" total management Fee: ").append(getTotalRent() * (managementFee / 100)).append("\n");
	        
	    return sb.toString();
	}

	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public Plot getPlot() {
		return plot;
	}
}


