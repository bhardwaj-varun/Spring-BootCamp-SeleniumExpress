package com.vb.di;

public class Airtel {
	Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void startService() {
		service.service();
	}
}
