package com.basicProgram;

public class Data {
	int rollNum;
	String name;
	double per;
	public void getData(int a, String n,double c) {
		rollNum = a;
		name = n;
		per = c;
	}
	public void putData() {
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(per);
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.getData(123, "ROhan", 76.67);
		d.putData();
	}

}
