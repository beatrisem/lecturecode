package lv.beatrise;

public class LearnMethodsWithParams {

	
	public static void main(String[] args) {
		double radius = 12.9;
		String color = "red";
		
		int resultClassInt = getArea(radius);
		double result = getAreaForCircle(radius);
		System.out.println("area is "+ resultClassInt);
		System.out.println("area: "+result);
		
		System.out.println(getColorAndArea(color, result));
	}
	
	public static int getArea(double radius){
		double result = Math.PI * (radius * radius);
		return (int)result;
	}
	
	public static double getAreaForCircle(double radius){
		double result = Math.PI * (radius * radius);
		return result;
	}
	public static String getColorAndArea(String color, double area){
		
		return"color:" +color +" and area: "+area;		
	}

}
