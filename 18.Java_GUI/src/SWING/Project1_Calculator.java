package SWING;

import java.awt.JButton;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JFrame;

class Calculator extends JFrame
{
	JToggleButton b1,b2,b3,b4,b5,b6;
	Calculator()
	{
		super("Calculator");
		b1 = new JToggleButton("One ");
		b2 = new JToggleButton("Two  ");
		b3 = new JToggleButton("Three");
		b4 = new JToggleButton("Four ");
		b5 = new JToggleButton("Five ");
		b6 = new JToggleButton("Six ");
		
		setLayout(new GridLayout(3,3));		// 3 rows and 3 columns
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}
public class Project1_Calculator 
{
	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();
		obj.setSize(400,400);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
