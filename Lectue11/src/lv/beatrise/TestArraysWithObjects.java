package lv.beatrise;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObjects {

	public static void main(String[] args) {
		
		Integer intObj = 40;
		Double doubleObj = 67.98;
		System.out.println(intObj);
		
		
		ArrayList<Integer> intArrays = new ArrayList<>();
			
		intArrays.add(40);
		intArrays.add(23);
		intArrays.add(403);
		intArrays.add(284);
		intArrays.add(402);
		intArrays.add(234);
		
		Collections.sort(intArrays);
		System.out.println(intArrays);
		
		
	}

}
