package lv.beatrise.testinterface;

public class Rectangle implements Shape {
	private int length;
	private int width;
	
	public Rectangle(int l, int w){
		this.length = l;
		this.width = w;	
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	
	
	
	
	
}
