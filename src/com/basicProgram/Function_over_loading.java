package com.basicProgram;

import java.util.Scanner;

public class Function_over_loading {
	Scanner sc = new Scanner(System.in);

	public void areaOfShape(double r) {
		System.out.println("enter redious = ");
		r = sc.nextDouble();
		double c = 3.13 * r * r;
		System.out.println("area of circle = " + c);

	}
	public void areaOfShape(int  side) {
		int area = side * side;
		System.out.println("area of square = "+area);
	}
	

	public void areaOfShape(int L, int B) {
		System.out.println("enter length = ");
		L = sc.nextInt();
		System.out.println("enter breadth = ");
		B = sc.nextInt();
		int c = L * B;
		System.out.println("area of rectangle = " + c);
	}

	public static void main(String[] args) {

		Function_over_loading area = new Function_over_loading();
		area.areaOfShape(0);
		area.areaOfShape(4, 5);
		area.areaOfShape(6);
	}
}
