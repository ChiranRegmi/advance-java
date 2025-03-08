package com.swing.demo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListenerDemo {
	JFrame frame;
	JTextField txtField;
	
	KeyListenerDemo(){
		System.out.println("Hello");
		frame=new JFrame();
		txtField=new JTextField(15);
		frame.add(txtField);
		frame.setSize(200, 200);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
	    new KeyListenerDemo();	
	}
}
