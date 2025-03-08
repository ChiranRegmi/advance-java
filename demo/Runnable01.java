package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SwingDemo implements ActionListener {
	//Declare
	JFrame frame;
	JLabel num1, num2;
	JTextField txtNum1, txtNum2;
	JButton sumBtn, subBtn,mult;
	JLabel result;

	SwingDemo() {
		// Frame Initailization
		frame = new JFrame();

		// Component Initialization

		num1 = new JLabel("First Number");
		txtNum1 = new JTextField(20);

		num2 = new JLabel("Second Number");
		txtNum2 = new JTextField(20);

		sumBtn = new JButton("Sum");
		subBtn = new JButton("Subtraction");

		result = new JLabel("");

		// add components to the container(frame)
		frame.add(num1);
		frame.add(txtNum1);

		frame.add(num2);
		frame.add(txtNum2);
		frame.add(subBtn);
		frame.add(sumBtn);
		

		frame.add(result);

		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		sumBtn.addActionListener(this);
		subBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());

		if (e.getSource() == sumBtn) {
			int sum = num1 + num2;
			result.setText("The Sum is"+sum);

		} else {
			int sub = num1 - num2;
			result.setText("The Subtraction is"+sub);
		}

	}
}

public class Runnable01 {
	public static void main(String[] args) {
		new SwingDemo();

	}

}
