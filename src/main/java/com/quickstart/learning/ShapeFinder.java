package com.quickstart.learning;

import java.awt.Color;

public class ShapeFinder {

	ShapeFinder(){
		System.out.println("ShapeFInder is initialized");
	}
	
	Shape shape;
	
	public Shape getShape() {
		return shape;
	}





	public void setShape(Shape shape) {
		this.shape = shape;
	}





	public void draw() {
		
		shape.draw();
	}
	
}
