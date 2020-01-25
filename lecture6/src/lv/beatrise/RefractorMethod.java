package lv.beatrise;

public class RefractorMethod {


	public static void main(String[] args) {
		
		
		System.out.println(getGreeting(21));
		getGreetingWithVoid(4);
	}
	
	public static String getGreeting(int time){
		if(time < 8) {
			return "good morning";
		} else if(time < 18) {
			return "good day";
		} else {
			return "good evening";
		}
		
		
	}
	
	public static void getGreetingWithVoid(int time){
	
	if(time < 8) {
		System.out.println("good morning");
	} else if(time < 18) {
		System.out.println("good day");
	} else {
		System.out.println("good evening");
	}
}
}