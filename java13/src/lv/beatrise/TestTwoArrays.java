package lv.beatrise;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6, 7, 8, 55, 40, 0};
		int[] arr2 = {0, 6, 8, 11, 13, 40};
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i : arr1){
			for(int j : arr2){
				if(i == j){
					arrList.add(i);
					break;
					
				}
			}
			
		}
		System.out.println(Arrays.asList(arrList));
		
		
		
	}

}
