package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo02 implements ActionListener {
	//Declaration
	JFrame frame;
	JButton btnMorning,btnAfterNoon;
	
	
	Demo02(){
		frame=new JFrame();
		frame.setSize(200,200);
		frame.setVisible(true);
		btnMorning=new JButton("Morning");
		btnAfterNoon=new JButton("AfterNoon");
		frame.add(btnMorning);
		frame.add(btnAfterNoon);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		btnMorning.addActionListener(this);
		btnAfterNoon.addActionListener(this);
	}
	public static void main(String[] args) {
		new Demo02();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnMorning) 
			System.out.println("Morning");
		if(e.getSource()==btnAfterNoon)
				System.out.println("Afternoon");
			
		
	}

}
