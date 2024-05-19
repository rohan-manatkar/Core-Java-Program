package com.basicProgram;

final class Final_class {
     
}
class honda extends  Final_class{
	void run() {
		System.out.println("running sefly"); 
	}
	public static void main(String[] args) {
		honda ho = new honda();
		ho.run();
	}
}
