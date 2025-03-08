package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing02 implements ActionListener{
	JFrame frame;
	JButton btn;

	Swing02() {
		frame = new JFrame();
		btn = new JButton("Click Me");
		frame.add(btn);
		frame.setSize(300, 300);
		btn.addActionListener(this);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
