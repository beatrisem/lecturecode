
public class OperatorMath {

	public static void main(String[] args) {
		double num1 = 0.4d;
		double num2 = 0.3d;
		double result;
		double resultMinus;
		double resultMult;
		double resultDivide;
		double resultModulus;
		char operators = '+';
		char operatorsMinus = '-';
		char operatorsMult = '*';
		char operatorsDivide = '/';
		char operatorsModulus = '%';
		
		result = num1 + num2;
		resultMinus = num1 - num2;
		resultMult = num1 * num2;
		resultDivide = num1 / num2;
		resultModulus = num1 % num2;
		
		System.out.println(num1 + " " + operators+ " "+num2 +"= "+result);
		
		System.out.println(num1 + " " + operatorsMinus+ " "+num2 +"= "+resultMinus);
		
		System.out.println(num1 + " " + operatorsMult+ " "+num2 +"= "+resultMult);
		
		System.out.println(num1 + " " + operatorsDivide+ " "+num2 +"= "+resultDivide);
		
		System.out.println(num1 + " " + operatorsModulus+ " "+num2 +"= "+resultModulus);
		
		int a = 10;
		int b = 3;
		int x = a % b;
		System.out.println("x = "+x);
		
		int i = 1;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result
		int p = ++k; 
		System.out.println("p after increment: " + p);
		int o = 2;
		int f = o++;
		System.out.println("f after increment: " + f);

	}

}
