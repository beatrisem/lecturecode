import java.util.Scanner;


public class ScannerCalculator {

	
	public static void main(String[] args) {
		
		
		Scanner calculator = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		int num1 = calculator.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = calculator.nextInt();
		calculator.nextLine();
		System.out.println("enter operator: ");
		String operators = calculator.nextLine();
		
		int result = 0;
		
		if(operators.equals("+")){
			result = num1 + num2;	
		}else if(operators.equals("-")){
			result = num1 - num2;
		}else if(operators.equals("/")){
			result = num1 / num2;
		}else if(operators.equals("*")){
			result = num1 * num2;
		}else if(operators.equals("%")){
			result = num1 % num2;
		}else{
			System.out.println("no operator");
		}
		
		
		System.out.println("your result is: "+result+"="+num1+operators+num2);
		
		

	}

}
