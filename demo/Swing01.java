package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swing01 implements ActionListener{
	//declare a container and components
	JFrame frame;
	JLabel lnum1,lnum2;
	JTextField txtName,txtAge;
	JButton btn;

	Swing01() {
		//Creating the frame
		frame=new JFrame();
		//Creating the components
		lnum1=new JLabel("Num1");
		lnum2=new JLabel("Num2");
		txtName=new JTextField(20);
		txtAge=new JTextField(20);
		btn=new JButton("Submit");
		//switch
		btn.addActionListener(this);
		
		//Setting the layout
		
		frame.setLayout(new FlowLayout());
		//Add components to the container
		frame.add(lnum1);
		frame.add(txtName);
		frame.add(lnum2);
		frame.add(txtAge);
		frame.add(btn);
		//Setting the size if the frame
		frame.setSize(300, 300);
		//By default frame in invisible so making it visible
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=Integer.parseInt(txtName.getText());
		int num2=Integer.parseInt(txtAge.getText());
		int sum=num1+num2;
		System.out.println(sum);
		
	}
	

}
