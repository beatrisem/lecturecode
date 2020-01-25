package lv.beatrise;

import lv.beatrise.geometricfigures.Circle;

public class TestFigure {

	public static void main(String[] args) {
		
		Circle figure = new Circle();
		Circle figure1 = new Circle(40.9);
		Circle figure2 = new Circle(30.6, "blue");
		

		System.out.println(figure.getColor() + " " + figure.getRadius());
		System.out.println(figure1.getColor() + " " + figure1.getRadius());
		System.out.println(figure2.getColor() + " " + figure2.getRadius());
		System.out.println("area is: "+figure1.getArea() + " "+ figure1.toString());
		System.out.println(figure2.toString());

	}

}
