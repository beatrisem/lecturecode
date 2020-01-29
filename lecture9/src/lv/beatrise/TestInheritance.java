package lv.beatrise;

import lv.beatrise.graph.Point2D;
import lv.beatrise.graph.Point3D;
import lv.beatrise.graph.Point4D;

public class TestInheritance {

	
	public static void main(String[] args) {
		
		
			Point2D point = new Point2D();
			System.out.println(point);
			
			Point2D point1 = new Point2D(2,3);
			System.out.println(point1);
			
			point1.setX(10);
			point1.setY(7);
			System.out.println(point1);
			System.out.println("x is "+ point1.getX());
			
			Point3D point1z = new Point3D(2,1,3);
			System.out.println(point1z);
			
			Point4D point1t = new Point4D(2,1,3,5);
			System.out.println(point1t);
			
			System.out.println(point1t.getX());
			
			
	}

}
