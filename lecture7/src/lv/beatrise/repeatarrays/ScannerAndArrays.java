package lv.beatrise.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {

	public static void main(String[] args) {
		//user inp array length
		//add to element val
		//values printed on screen
		//create methods for printing out array values
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("input first ");
		arr[0]=sc.nextInt();
		System.out.println("input second");
		arr[1]=sc.nextInt();
		
	
		System.out.println(arr[0]+" "+arr[1]);
		

	}

}
