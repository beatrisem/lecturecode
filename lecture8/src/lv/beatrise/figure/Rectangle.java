package lv.beatrise.figure;

public class Rectangle {

	private float length = 1.3f;
	private float width = 1.3f;
	
	
	
	public Rectangle(){
		this.length = 12.0f;
		this.width = 14.0f;
	}
	
	public Rectangle(float width){
		this.length = 2.2f;
		this.width = width;
	}	
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	

	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}


	public String toString() {
		return "Rectangle length: "+this.length +"width: "+this.width;
	}
	
	
	
	
	
	
}
