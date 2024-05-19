package com.abstraction;

abstract class bike{
	bike(){
		System.out.println("bike is created");
	}

	public abstract void run();
	void changeGear() {
		System.out.println("gear changed");

	}
}

class Honda extends bike{
	public final void  run() {
		System.out.println("running safely");
	}
}
public class Abstract_Class {
public static void main(String[] args) {
	bike obj = new Honda();
	obj.run();
	obj.changeGear();
	
}
}
