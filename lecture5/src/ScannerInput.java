import java.util.Scanner;


public class ScannerInput {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter name: ");
		String name = sc.nextLine();
		
		System.out.println("your num is: "+number);
		System.out.println("your name is: "+name);
		
		
		
	}

}
