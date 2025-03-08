package com.swing.demo;

public class Animal {
	void eat() {
		System.out.println("Meat");
	}
	void mode_of_movement() {
		System.out.println("Leg");
	}
}
class Lion extends Animal{
	
}
class Tiger extends Animal{
	
}
class Leopard extends Animal{
	
}
class Cow extends Animal{
	@Override
	void eat() {
		System.out.println("Grass");
	}
}
