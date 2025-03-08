package com.swing.demo;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DemoSwing01 {
	JFrame frame;
	JLabel lbName,lbAge;
	JTextField txtName,txtAge;
	JButton btn;
	
	
	public DemoSwing01() {
		frame=new JFrame();
		lbName=new JLabel("Name");
		lbAge=new JLabel("Age");
		txtName=new JTextField(20);
		txtAge=new JTextField(20);
		btn=new JButton("Submit");
		
	     frame.add(lbName);
	     frame.add(txtName);
	     frame.add(lbAge);
	     frame.add(txtAge);
	     frame.add(btn);
	     
	     
	     frame.setLayout(new FlowLayout());
	     
	     frame.setVisible(true);

	     frame.setSize(300,300);
	}
	public static void main(String[] args) {
		new Swing01();
	}
	

}
