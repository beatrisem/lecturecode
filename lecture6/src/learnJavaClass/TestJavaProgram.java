package learnJavaClass;

public class TestJavaProgram {

	
	
	public static void main(String[] args) {
		Box boxObject = new Box();
		double volume;
		
		boxObject.width = 30.4;
		boxObject.height = 6.5;
		boxObject.depth = 7.8;
		
		double result = boxObject.getVolume();
		
		System.out.println("vol "+result);
//		double volume;
//	
//	
//		
//		volume = boxObject.width + boxObject.height + boxObject.depth; 
//		
//		System.out.println("volume "+volume);
//		
//		Box boxObject2 = new Box();
//		double volume;
		
		
	}

}
