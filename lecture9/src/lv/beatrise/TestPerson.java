package lv.beatrise;

import lv.beatrise.users.Teacher;

public class TestPerson {

	
	
	public static void main(String[] args) {
		
		String[] strArr = new String[12];
		strArr[0] = "sport";
		strArr[1] = "lit";
		strArr[2] = "geo";
		System.out.println(strArr[0]+" "+strArr[1]+" "+strArr[2]);
		System.out.println("++++++++++++++++++++++");
		
		Teacher teacher1 = new Teacher("aina", "riga");
		System.out.println(teacher1.toString());
//		teacher1.addCourse("sports");
//		teacher1.addCourse("bio");
//		teacher1.addCourse("lit");
		String[] courses = {"sports", "bio", "lit", "geo"};
		for(String course : courses){
			teacher1.addCourses(course);
		}
		

	}

}
