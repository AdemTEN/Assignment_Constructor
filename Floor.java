package Assignment_Constructor;

public class Floor {

	double width;
	double length;
	
	public Floor(double witdh, double length) {
		if (witdh<0) {
			this.width = 0;
		}else {
			this.width = witdh;
		}
		
		if(length<0) {
			this.length = 0;
		}else {
			this.length = length;
		}
	}
	
	public double getArea() {
		
		return width * length;
	}
	
	
}
