public class IfElseAndTernaryOperator {

	public static void main(String[] args) {
		boolean test = true;
		if (test) {
			System.out.println("test pass true");
		} else {
			System.out.println("test false");
		}

		String showResult = test ? "test passed" : "did not pass";

		System.out.println(showResult);

		int num1 = 1;
		int num2 = 10;
		int result;

		result = (num1 < num2) ? (num1 + num2) : (num1 - num2);
		System.out.println(result);

	}

}
