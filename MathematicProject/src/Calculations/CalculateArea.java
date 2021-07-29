package Calculations;

import java.util.ArrayList;
import java.util.Iterator;

public class CalculateArea {
	public static void main(String[] args) {
		AreaForSquare sq = new AreaForSquare(3.5);
		AreaForRectangle rec = new AreaForRectangle(6, 5.5);
		AreaForTriangle tri = new AreaForTriangle(7, 7.5);
		
		ArrayList<Double> area = new ArrayList<Double>();
		area.add(sq.CalculateAreaofSquare());
		area.add(rec.CalculateAreaofRectangle());
		area.add(tri.CalculateAreaofTriangle());
		
		Iterator<Double> i = area.iterator();
		try {
			while(i.hasNext()) {
				DisplayAreaforShapes dis = new DisplayAreaforShapes();
				dis.display(i.next());
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Areas for geometric dimensions calculated.");
		}
	}

}
