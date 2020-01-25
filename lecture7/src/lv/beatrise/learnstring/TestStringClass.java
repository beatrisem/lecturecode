package lv.beatrise.learnstring;

public class TestStringClass {

	
	public static void main(String[] args) {
		String str = " ho L   a  ";
		String strClass = new String("param");
		
		
		System.out.println(str);
		System.out.println(strClass+"--");
		
		int stringLength = str.length();
		System.out.println(stringLength);
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());//no abam ousem nonem space
		System.out.println(str.replace(" ", ""));
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Nope";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(!s1.equals(s2));
		System.out.println(!s2.equals(s3));
		
	}

}
