package com.basicProgram;
class Count{
	static int count = 0;
	Count(){
		count++;
		System.out.println(count);
		
	}

}



public class Static_key {
	public static void main(String[] args) {
	Count c = new Count();
	Count c1 = new Count();
	Count c2 = new Count();
	}
}
