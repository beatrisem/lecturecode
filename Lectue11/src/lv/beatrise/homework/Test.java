package lv.beatrise.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 6, 7, 9));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 6, 7, 9, 10, 7, 56));
		
		System.out.println("List1 is"+ list1);
		System.out.println("List2 is"+ list2);
		System.out.println("Elementis in both: ");
		Intersect(list1, list2);
		
	}
	
	public static ArrayList<Integer> Intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list3 = new ArrayList<Integer>();
			for(int i = 0; i<list1.size(); i++){
				for (int j = 0; j < list2.size(); j++){
					if(list1.get(i)== list2.get(j)) {
						list3.add(list1.get(i));
						break;
					}
				}
			}
			 
		System.out.println(list3);
		return list3;
	}
	
}
