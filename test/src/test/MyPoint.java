package test;

import javax.xml.bind.annotation.XmlElement;

public class MyPoint {
	private int x, y; 
	public MyPoint(){}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@XmlElement(name="x")
	public int getX() {
	 return x; 
	 }
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	@XmlElement(name="y")
	public int getY() {
		 return y; 
	}
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
}
