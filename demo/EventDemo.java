package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo implements ActionListener{
	JFrame frame;
	JButton gmBtn,gaBtn;
	
	EventDemo(){
		frame=new JFrame();
		
		gmBtn=new JButton("Good Morning");
		frame.add(gmBtn);
		
		gaBtn=new JButton("Good AfterNoon");
		frame.add(gaBtn);
		
		
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setLayout(new FlowLayout());
		gmBtn.addActionListener(this);
		gaBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new EventDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==gmBtn)
			System.out.println("Giid Morniing");
		if(e.getSource()==gaBtn)
			System.out.println("Good Afternoon");
		
			
		
	}

}
