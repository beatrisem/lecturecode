package lv.beatrise.inputoutput;

import java.io.*;
import java.util.Scanner;

public class TestExample {

	/**
	 * @param args
	
	 */
	public static void main(String[] args) throws Exception {
//		String defaultStr = "Hello user userName";
//		String lastString = defaultStr.replace("userName","");
//		System.out.println(lastString+"Beatrise");
		
		
		File file = new File("userDefault.txt");
		
		Scanner sc = new Scanner(file);
		String stringFromTextFile = "";
		while(sc.hasNextLine()){
			stringFromTextFile = sc.nextLine();
		}
		
//		System.out.println("check: "+ stringFromTextFile);
		String lastString = stringFromTextFile.replace("username","");
		String userName = "Beatrise";
		File fileForUser = new File(userName+".txt");
		FileWriter fw = new FileWriter(fileForUser, true);
		fw.write(lastString+userName);
		fw.close();
		
		
		
		System.out.println(lastString+"Beatrise");
		
		
	}

}