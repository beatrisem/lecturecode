package lv.beatrise;

import java.util.ArrayList;

public class TestCarArrList {

	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Jaguar");
		
		System.out.println(cars.indexOf("BMW"));
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(2));
		System.out.println(cars.set(0, "Mercedes"));
		cars.clear();
		
		
		System.out.println("+++++++++++++++");
		
		for (String c : cars){
			System.out.println(c);
			
		}
		System.out.println("____________");
		cars.remove("BMW");
		for (String c : cars){
			System.out.println(c);
			
		}
		
		
	}

}
