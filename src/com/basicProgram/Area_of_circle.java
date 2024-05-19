package com.basicProgram;

import java.util.Scanner;

public class Area_of_circle {
	float r;
	double area;
	Scanner sc = new Scanner(System.in); 

public void input() {
	System.out.println("enter redius");
	r=sc.nextFloat();
}
public void output() {
	
	area = 3.14*r*r;
	System.out.println("area of circle is "+area);
}
public static void main(String[] args) {
	Area_of_circle area = new Area_of_circle();
	area.input();
	area.output();
}

}
