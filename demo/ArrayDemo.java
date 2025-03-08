package com.swing.demo;

import java.util.ArrayList;

public class ArrayDemo {
	
	public static void greet(String[] names) {
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public static void main(String[] args) {
		String [] myNames=new String[3];
		myNames[0]="ram";
		myNames[1]="hari";
		myNames[2]="Sita";
		greet(myNames);
		
	}

}
