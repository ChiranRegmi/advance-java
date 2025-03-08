package com.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SetBoundsDemo2 {
  JFrame frame;
  JButton btnGm,btnGa;
  SetBoundsDemo2(){
	  frame=new JFrame();
	  btnGm=new JButton("morning");
	  btnGa=new JButton("Afternoon");
	  frame.setLayout(null);
	  btnGm.setBounds(100, 20, 80, 40);
	  btnGa.setBounds(100, 80, 80, 40);
	  frame.add(btnGm);
	  frame.add(btnGa);
	  frame.setSize(400, 400);
	  frame.setVisible(true);
  }
  public static void main(String[] args) {
	new SetBoundsDemo2();
}
  
  
}
