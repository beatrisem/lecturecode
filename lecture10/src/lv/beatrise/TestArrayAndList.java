package lv.beatrise;

public class TestArrayAndList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[10];
		String[] arrWith = {"2","3","o","2","3","o","2","3","o","09"};
		
	}
		
		public static void arrayToString(String[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println("index nums are "+i+" "+ arr[i]);
		}
		
		}

		public static void addElementsToArray(String[] arr){
			for(int i = 0; i < arr.length; i++){
				System.out.println("index nums are "+i+" "+ arr[i]);
				arr[i] = arr[i] +i;
			}
			
			arrayToString(arr);
			
		}
}
