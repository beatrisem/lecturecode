package lv.beatrise;

import lv.beatrise.bookstore.Author;
import lv.beatrise.bookstore.Book;

public class TestBookstore {

	
	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowling", "harry@potter.edu", 'f');
		Author rainis = new Author("Rainis", "zeltazirgs@stiklakalns.lv", 'm');
		
		
		System.out.println(rowling.getEmail());
		rowling.setEmail("harry@row.ed");
		System.out.println(rowling.getEmail());
		
		
		Book harrypotter = new Book("Harry Potter", rowling, 2.22, 3);
		System.out.println(harrypotter.toString());
		Book testBook = new Book("b", new Author("a","b",'f'), 3.4, 2);
		
		
		System.out.println(testBook.toString());
		
		System.out.println("||||||||||||||||||||||||");
		
		Author test1 = new Author("Vlad","name@na.lv",'f');
		Author test2 = new Author("Vlad","name@na.lv",'p');
		
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
	
		
		char m = 'm';
		char f = 'f';
		char o = 'j';
		
		
		
		
		switch(o){
		case 'm':  System.out.println("M");
			break;
		case 'f': System.out.println("F");
			break;
		default:
			System.out.println("other");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
