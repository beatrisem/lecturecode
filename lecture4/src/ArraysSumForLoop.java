
public class ArraysSumForLoop {

	
	public static void main(String[] args) {
		int[] marks = {56, 65, 34, 54, 90};
		
//		int result = 10;
//		System.out.println(" "+ result);
//		int test = 90;
//		result = test;
//		System.out.println(" "+ result);
		int sum = 0;
		
		
		for(int i = 0; i < marks.length; i++ ) {
			sum +=marks[i];			
		}System.out.println("Sum is: "+ sum);
		
		
		
		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest = sumTest +300;
		sumTest = sumTest +3500;
		System.out.println("sum is " + sumTest);
		
		int subTest = 0;
		subTest -= 200;
		subTest -= 300;
		subTest -= 3500;
		System.out.println("subtract is " + subTest);
		
		
		
	}

	

}
