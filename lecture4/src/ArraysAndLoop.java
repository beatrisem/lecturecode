
public class ArraysAndLoop {

	public static void main(String[] args) {
		int[] marks = {56, 65, 34, 54, 90};
		//make to string all elements
		
		for(int i = 0; i < marks.length; i++ ){
			System.out.println(marks[i]);
		}
		
		
		System.out.print("[");
		for(int i = 0; i < marks.length-1; i++ ){
			
			System.out.print(marks[i]+",");
			
		} System.out.print(marks[marks.length-1]+"]"); 
		
	}

}
