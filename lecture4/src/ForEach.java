
public class ForEach {

	
	public static void main(String[] args) {
		int[] marks = {56, 65, 34, 54, 90};
		//foreach loop for(type var : arrays)
		for(int mark : marks) {
			
			System.out.println(mark);
		}
		System.out.println("++++++++++++++++++");
		
		for(int i = 0; i < marks.length; i++ ){
			
			System.out.println(marks[i]);
			
		}
		

	}

}
