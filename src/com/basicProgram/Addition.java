package com.basicProgram;
class Addition {
void show() {
	System.out.println("show method called");
	
}
void add(int a, int b) {
	System.out.println("addition of two number" + a+b);
}


 
	
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.show();
		ad.add(5,10);
	}

}