
public class ControlFlowIf {

	public static void main(String[] args) {
		int x = 10;
		int y = 22;
		
		if(x>y) {
			System.out.println("x < y");
		}
		
		int numberCheck = 21;
		
		if(numberCheck % 2 == 0) {
			System.out.println(numberCheck + " is even");
		} else {
			System.out.println(numberCheck + " is odd");
		}
		
		int mark = 50;
		
		if(mark >= 50) {
			System.out.println(mark + " PASS");
		} else {
			System.out.println(mark + " FAIL");
		} 
		System.out.println("DONE");
		
		

	}

}
