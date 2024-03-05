package com.vb.di;

public class Student {
	private String studentName;
	private int id;

	public Student(String name, int id ) {
		this.studentName = name;
		this.id = id;
	}
	public void display() {
		System.out.println("Student name is : "+ studentName +" and id : "+ id);
	}
}
