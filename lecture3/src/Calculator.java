public class Calculator {

	public static void main(String[] args) {

		double num1 = 8;
		double num2 = 5;
		char operatorMath = '/';
		double result;

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(result);

		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(result);

		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(result);

		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(result);

		} else if (operatorMath == '%') {
			result = num1 % num2;
			System.out.println(result);

		} else {
			System.out.println("no operator");
		}

		System.out.println("---------------------------------------------");

		switch (operatorMath) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println(result);
			break;
		default:
			System.out.println("no opearator");
		}

	}

}
