package lv.beatrise;

public class TestExceptionHandling {

	
	public static void main(String[] args) {
		
		try{
			int number1 = 0;
			int number2 = 10;
			
			int result = number2 / number1;
			
			System.out.println(result);
			
		} catch(Exception e){
			System.out.println("Check code in try block"+e);
		}
		
		try {
		int[] myNumbers = {1, 3, 4};
		System.out.println(myNumbers[2]);
		} catch(Exception r){
			System.out.println("error in array");
		}finally{
			System.out.println("check numbers finished try catch");
		}
		
		
		
		
		
	}

}
