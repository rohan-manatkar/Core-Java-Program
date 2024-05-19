package com.inheritance;
class a{
	int a =50;
	public void display() {
		System.out.println("this is a  "+a);
	}
}
class b extends a {
	int a =50;
	int ans;
	public void add() {
		ans=this.a+a;
		System.out.println(ans);
		
	}
	public void display() {
		super.display();
		System.out.println(ans);
	}
}



public class Supper {
	public static void main(String[] args) {
		
	
b obj = new b();

obj.add();
obj.display();

}
}