package lv.beatrise;

public class LearnMethods {

	// void doesn't have a type
	// static nevajag klases obj lai izsauktu metodi
	// public ir modifier
	public static void main(String[] args) {
		getMyName();
		getMyName();
		getMyName();
		System.out.println("+++++++++++++++++++++++++++");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.getCat();

	}
	public static void getMyName(){
		System.out.println("my name is beatrise");
	}
	public static void getMyCity(){
		getMyName();
		System.out.println("Riga");
	}

	public void getCat(){
		System.out.println("nope");
}


}
