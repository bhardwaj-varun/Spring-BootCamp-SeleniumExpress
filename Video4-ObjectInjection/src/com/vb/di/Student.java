package com.vb.di;

public class Student {

	MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void startCheating() {
		System.out.println("Cheating started");
	}

}
