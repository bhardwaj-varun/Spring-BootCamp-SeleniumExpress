package com.vb.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application config loaded.");
		Airtel airtel = context.getBean("airtelBean", Airtel.class);
		airtel.startService();
	}
}
