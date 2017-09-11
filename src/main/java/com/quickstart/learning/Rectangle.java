package com.quickstart.learning;

public class Rectangle  implements Shape {
	
	String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Rectangle(String type) {
		this.type=type;
	}
	


	public void draw() {
		System.out.println("Type is "+type);
		
	}

}
