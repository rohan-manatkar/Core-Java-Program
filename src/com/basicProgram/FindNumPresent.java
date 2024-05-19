package com.basicProgram;

public class FindNumPresent {
	public static void main(String[] args) {
		int a[] = {15,5,4,6,23,7,8,3};
		int search = 100;
		int flg = 0;
		for (int i : a) {
			if(i == search) {
				flg = 1;
				break;
				}
			}
	System.out.println(flg);
		if(flg == 1) 
			System.out.println("present");
			else
			System.out.println("not present");
		
		
	

}
}
