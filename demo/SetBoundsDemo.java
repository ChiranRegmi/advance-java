package com.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SetBoundsDemo {
	JFrame frame;
	JLabel lname,lage;
	JTextField txtName,txtAge;
	JButton btn;
	
	
	SetBoundsDemo(){
		frame=new JFrame();
		lname=new JLabel("Name");
		txtName=new JTextField(50);
		lage=new JLabel("Age");
		txtAge=new JTextField(50);
		frame.setLayout(null);
		txtName.setBounds(100, 100, 50, 20);
		lname.setBounds(50,100,50,20);
		
		frame.add(txtName);
		frame.add(lname);
		frame.setSize(600,600);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new SetBoundsDemo();
	}
	

}
