package lv.beatrise.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		if(checkGender(gender)){
			this.gender = gender;
		}else{
			this.gender = 'x';
		}
		
	}
	
//	public Author(String name){
//		this.name = name;
//	}
	

	public static boolean checkGender(char gender) {
		char m = 'm';
		char f = 'f';
		
		if(m == gender || f == gender){
			return true;
		}else{
			return false;
		}	
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	
	
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
		}

}
