
public class SwithTask {

	public static void main(String[] args) {
		
		int number = 2;
		
		switch(number) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default: 
				System.out.println("not number");
		}
		
		System.out.println("---------------------------------------------");
		
		double num1 = 8;
		double num2 = 3;
		char operatorMath = '%';
		double result;
		
		switch(operatorMath) {
		case '+':
			result = num1+num2;
			System.out.println(result);
			break;
		case '-':
			result = num1-num2;
			System.out.println(result);
			break;
		case '*':
			result = num1*num2;
			System.out.println(result);
			break;
		case '/':
			result = num1/num2;
			System.out.println(result);
			break;
		case '%':
			result = num1%num2;
			System.out.println(result);
			break;
		default: 
			System.out.println("no opearator");
	}

	}

}
