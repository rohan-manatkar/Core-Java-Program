package com.basicProgram;

import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
	int a = 0;
	 int b = 1;
		while(i<=num) {
			int next = a+b;
			a=b;
			b=next;
			System.out.println(next);
			i++;
		
			
		}
	}

}
