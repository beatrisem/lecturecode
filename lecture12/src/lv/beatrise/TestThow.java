package lv.beatrise;

public class TestThow {

	
	public static void main(String[] args) {
		
		checkAge(9);
		
		}
		
	public static void checkAge(int age){
		if(age < 10){
			throw new ArithmeticException("Access denied");
		}else {
			System.out.println("access granetd");
			
		}
		
		
		
	}

}
