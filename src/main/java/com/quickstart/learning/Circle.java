package com.quickstart.learning;

public class Circle implements Shape {
	
	String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Circle() {}
	


	public void draw() {
		System.out.println("Type is "+type);
		
	}

}
