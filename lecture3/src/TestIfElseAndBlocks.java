
public class TestIfElseAndBlocks {


	public static void main(String[] args) {
		System.out.println("******");
		System.out.println("******");
		
		boolean test = true;
		int result;
		
		if(test){
			int number = 589;
			System.out.println("true");
			System.out.println(number);
			result = number + number;
			System.out.println("result is: "+ result);
		}else{
			System.out.println("false");
		}
		
		System.out.println("after if else block");
		
		boolean test2 = true;
		
		if(test2){
			System.out.println("true");
			int number = 3;
			System.out.println("test 2 num: "+number);
		}else{
			System.out.println("false");
		}
		System.out.println("after if else block");
		
	}

}
