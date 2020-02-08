package lv.beatrise.inputoutput;

import java.io.File;



public class TestFile {

	public static void main(String[] args) {
		
		
		File myFile = new File("Data.txt");
		String path = myFile.getAbsolutePath();
		System.out.println(path);
		if( myFile.exists()){
			System.out.println(myFile.getName() + " exists");
			System.out.println("file is "+ myFile.length() + " bytes long");
			if(myFile.canRead()){
				System.out.println(" can read");
			}else{
				System.out.println(" can't read");
			}
			
			if(myFile.canWrite()){
				System.out.println(" can write");
			}else{
				System.out.println(" can't write");
			}
			
		}else{
			System.out.println("not found");
		}
	}

}
