package com.swing.demo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerDemo extends  MouseAdapter
{
	JFrame frame;
	
	public MouseListenerDemo() {
		frame=new JFrame();
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseListenerDemo();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exited");
		
	}
	
}