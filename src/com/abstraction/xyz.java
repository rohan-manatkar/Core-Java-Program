package com.abstraction;



abstract class xyza{
	
	abstract void display(); 
	
}
 class add extends xyza{
	 public void display() {
		 System.out.println("add something here");
	 }
 }
public class xyz {
	public static void main(String[] args) {
		
	
add obj = new add();
obj.display();
}
}