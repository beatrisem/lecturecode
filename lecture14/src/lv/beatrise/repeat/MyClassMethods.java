package lv.beatrise.repeat;

public class MyClassMethods {

	public MyClass myClass;
	
	public MyClassMethods(MyClass myClass){
		this.myClass = myClass;
	}
	
	public MyClass createNewObjMyClass(){
		return new MyClass();
	}
	
	static void myMethod(){
		System.out.println("Hello");
		
	}
	
	public String myStringMethod(){
		
		myMethod();
		
		return " ";
	}
	
	public double returnDouble(){
		
		return 3.76;
	}
	
	public char returnChar(int a, int b){
		int charFromInt = a + b;
		
		char  charVariable = (char)charFromInt;
		char  charVariableSym = 'a';
		return charVariable;
		
	}
	
}
