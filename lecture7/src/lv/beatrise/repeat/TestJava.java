package lv.beatrise.repeat;

import java.util.Scanner;

public class TestJava {

	
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Input value ");
		
		int inputValue;
		
		
		while(input.hasNext()){
			if(input.hasNextInt()){
				inputValue=input.nextInt();
			System.out.println("inp val is "+ inputValue);
		}else {
			
			System.out.println("assign inp");
			input.next();
			}
			
			
		}
		
	//	System.out.println("inp val is "+ inputValue);
		
	}

}
