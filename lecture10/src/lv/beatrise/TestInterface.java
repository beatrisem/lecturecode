package lv.beatrise;

import lv.beatrise.testinterface.Rectangle;
import lv.beatrise.testinterface.Shape;
import lv.beatrise.testinterface.Triangle;

public class TestInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 90;
		
		Rectangle rect = new Rectangle(num1, num2);
		
		Shape figure = new Rectangle(5, 10);
		
		System.out.println(figure.toString());
		System.out.println(figure.getArea());
		
		Shape figure1 = new Triangle(3, 8);
		System.out.println(figure1.getArea());
	}

}
