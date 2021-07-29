package Calculations;

public class AreaForRectangle extends DisplayAreaforShapes{
	double length;
	double width;
	
	public AreaForRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double CalculateAreaofRectangle() {
		double area = length * width;
		return area;
	}
	
	void display() {
		super.display(CalculateAreaofRectangle());
	}

}
