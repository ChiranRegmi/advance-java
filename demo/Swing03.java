package com.swing.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Swing03 implements ActionListener{
	JFrame frame;
	JButton btn;
	JTextField txt;
	Swing03(){
		frame=new JFrame();
		txt=new JTextField(20);
		btn=new JButton("Hi");
		frame.add(txt);
		frame.add(btn);
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
		btn.addActionListener(this);
	}
	public static void main(String[] args) {
		new Swing03();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=txt.getText();
		System.out.println(name);
	}

}
