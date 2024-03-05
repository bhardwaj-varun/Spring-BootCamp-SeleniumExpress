package com.vb.di;

public class Student {
	
	Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		cheat.cheat();
	}
}
