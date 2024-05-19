package com.basicProgram;



public class Final_Keyword {
	final int speedlimit = 90;
	void run() {
		speedlimit = 400;
	}
	public static void main(String[] args) {
		Final_Keyword obj = new Final_Keyword();
		obj.run();
	}
}
