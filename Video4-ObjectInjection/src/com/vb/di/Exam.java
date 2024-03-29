package com.vb.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		student.startCheating();

		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}
}
