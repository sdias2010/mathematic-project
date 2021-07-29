package Calculations;

public class AreaForTriangle extends DisplayAreaforShapes{
	double base;
	double height;
	public AreaForTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	double CalculateAreaofTriangle() {
		double area = (base * height)/2;
		return area;
	}
	
	void display() {
		super.display(CalculateAreaofTriangle());
	}

}
