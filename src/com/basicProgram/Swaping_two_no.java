package com.basicProgram;
import java.util.Scanner;

public class Swaping_two_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;

		}
		System.out.println(sum);

		//System.out.println(sum);
		if (sum==a) 
			System.out.println(" number is palendrome");
		else
			System.out.println("number is not palendrome");
		
	}

}
