package lv.beatrise;

import java.util.Scanner;

public class TestScannerInputArray {

	public static void main(String[] args) {
		//masivs
		//scanneris kur glabat un stringu
		//while loop
		
		Scanner scan = new Scanner(System.in);
		String[] strArr = new String[3];
		int arrElCount = scan.nextInt();
		System.out.println(strArr.length + " users in array");
		for(int i = 0; i< strArr.length; ++i){
			strArr[i] = scan.nextLine();
		}
		
		System.out.println("something 1: ");
		System.out.println("Type (Print): ");
		System.out.println("Type (Notprint): ");
		String statusCheck = scan.nextLine().toLowerCase().trim();
		
		if(statusCheck.equals("Print")){
	//		printArray(strArr);
		}else if(statusCheck.equals("Notprint")){
			System.out.println("exit");
		}else{
			System.out.println("wrong");
		}}
		
//		public static void printArray(String[] str){
//			for(int i = 0; i < strArr.length; ++i){
//				System.out.println(str[i]+" was added");
//			}
//			
//		}
}
