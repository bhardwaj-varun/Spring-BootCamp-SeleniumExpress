package com.seleniumexpress.ioc;

public class Mobile {

	public static void main(String[] args) {

		Sim sim = new Airtel();
		sim.calling();

		sim = new Vodafone();
		sim.calling();
	}
}
