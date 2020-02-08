package lv.beatrise.inputoutput;
import java.io.*;



public class TestFileReader {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("Data.txt");
		
		char test = 100;
		System.out.println(test);
		
		
		int i;
		while((i =fr.read()) != -1){
			System.out.print((char)i);
			
		}
		
		
		
		
		
	}

}
