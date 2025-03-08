package com.swing.demo;

public class MyMac {

	int si(int p, int t, int r) {
		return p * t * r;

	}

	void bye() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		MyMac m = new MyMac();
		m.bye();
		int result = m.si(100, 20, 20);
		if (result > 500) {
			System.out.println("pay immediuately");

		}

	}

}
