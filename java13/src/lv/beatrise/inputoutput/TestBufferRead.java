package lv.beatrise.inputoutput;

import java.io.*;


public class TestBufferRead {

	
	public static void main(String[] args) throws Exception {
		File file = new File("Data.txt");
		FileReader filReader = new FileReader(file);
		BufferedReader buffReader = new BufferedReader(filReader);
		
		String stringFileData;
		
		while((stringFileData = buffReader.readLine()) != null){
			System.out.println(stringFileData);
		}
		
		
	}

}
