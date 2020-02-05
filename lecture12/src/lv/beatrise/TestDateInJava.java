package lv.beatrise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.println("time in machine: "+myDateObj);
		
		DateTimeFormatter myFormatObjTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		String formatedDate = myDateObj.format(myFormatObjTime);
		
		System.out.println("after edit: "+formatedDate);
		
		
	}

}
