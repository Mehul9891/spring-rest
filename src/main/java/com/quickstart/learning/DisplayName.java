package com.quickstart.learning;

public class DisplayName {
	
	String name;
	String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	void display() {
      System.out.println("Welcome "+name +" "+surname);		
	}
}
