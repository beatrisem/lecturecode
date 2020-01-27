package lv.beatrise.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {

	public static void main(String[] args) {
		//user inp array length
		//add to element val
		//values printed on screen
		//create methods for printing out array value
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("enter array length: ");
		int size = scan.nextInt();
		int[] array= new int[size];
		
		System.out.println("insert elements: ");
		for(i=0; i <= size; i++){
			array[i] = scan.nextInt();
		}
		
		System.out.println("inserted el: ");
		for(i=0; i <= size; i++) {
			System.out.println(array[i]);
		}
		
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[2];
//		System.out.println("input first ");
//		arr[0]=sc.nextInt();
//		System.out.println("input second");
//		arr[1]=sc.nextInt();
//		
//	
//		System.out.println(arr[0]+" "+arr[1]);
		

	}

}
