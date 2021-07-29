package Calculations;


class AreaForSquare extends DisplayAreaforShapes{
	double length;

	public AreaForSquare(double length) {
		this.length = length;
	}
	
	protected double CalculateAreaofSquare() {
		double area = length * length;
		return area;
	}
	
	void display() {
		super.display(CalculateAreaofSquare());
	}
}