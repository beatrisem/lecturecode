public class ArraysPrimitiveDataType {

	public static void main(String[] args) {

		int[] arrays;
		// int arrays2[]; tas pats
		arrays = new int[2];// pasaka cik vietas bus
		// int[] arrays = new int[10]; tas pats
		int[] arrTest = new int[5];
		arrTest[0] = 10;
		arrTest[1] = 3;

		arrTest[4] = 4;
		System.out.println(arrTest[3]);

		System.out.println("*******************");
		double[] doubleArray = new double[3];
		doubleArray[0] = 0.4;
		doubleArray[1] = 0.7;
		doubleArray[2] = 1.4;

		System.out.println(doubleArray[0] + " " + doubleArray[1] + " "+ doubleArray[2]);
		System.out.println("*******************");
		char[] charArray = new char[2];
		charArray[0] = 77;
		charArray[1] = 'h';
		
		System.out.println(charArray[0] + " " + charArray[1]);
		System.out.println("*******************");
		
		boolean[] booleanArray = new boolean[2];
		booleanArray[0] = true;
		booleanArray[1] = false;
		System.out.println(booleanArray[0] + " " + booleanArray[1]);
		
		int checkLength = arrTest.length;
		int checkLength2 = booleanArray.length;
		System.out.println(checkLength);
		System.out.println(checkLength2);
		
		
		System.out.println(booleanArray[booleanArray.length-1]);
	}

}
