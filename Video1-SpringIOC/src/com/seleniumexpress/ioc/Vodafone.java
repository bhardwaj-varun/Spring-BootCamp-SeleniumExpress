package com.seleniumexpress.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from Vodafone");
	}

}
