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
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth=1;
	}

	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot other) {
		this.x = other.x;
		this.y = other.y;
		this.width = other.width;
		this.depth = other.depth;
	}

	// Getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}
	//Setter

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	//Overlapping method
	public boolean overlaps(Plot plot) {
		return (x < plot.x + plot.width && x + width > plot.x && y < plot.y + plot.depth && y + depth > plot.y);
	}

	//Encompasses method
	public boolean encompasses(Plot plot) {
		return (x <= plot.x && y <= plot.y && x + width >= plot.x + plot.width && y + depth >= plot.y + plot.depth);
	}

	//toString method
	public String toString() {
		return String.format("%d,%d,%d,%d", x, y, width, depth);
	}

}

