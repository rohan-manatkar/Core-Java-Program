package com.inheritance;

class Add_peramiter {
	int a = 5;
	int b = 10;

}

class add extends Add_peramiter {
	void adds() {
		int c = a +b;
		System.out.println(c);
	}
}

public class Addition {
	public static void main(String[] args) {
		add a = new add();
		a.adds();

	}
}
