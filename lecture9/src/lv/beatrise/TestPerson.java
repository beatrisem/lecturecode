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
		
		Teacher t1 = new Teacher("tom", "uk");
		System.out.println(t1.toString());
		
		String[] courseForT1 = {"sport","visual","hist", "sport"};
		for(String cour : courseForT1){
			if(t1.addCourses(cour)){
				System.out.println(cour + " added");
			}else{
				System.out.println("this cour cannot be added");
			}
		}
		
		for(String cour : courseForT1){
			if(t1.removeCourses(cour)){
				System.out.println(cour + " removed");
			}else{
				System.out.println("this cour cannot be removed");
			}
		}
		
		
		
		

	}

}
