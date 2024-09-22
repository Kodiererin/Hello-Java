package Test_GUI.CalculatorProject;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.*;

import Test_GUI.CalculatorProject.*;
class myFrame extends JFrame
{
	JTextArea txt;
	JPanel p;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton plus;
	JButton sub;
	JButton divide;
	JButton mul;
	JButton equal;
	
//	JBorderLayout b1 = new JBorderLayout();
	myFrame()
	{
		super("Calculator");
		
		txt = new JTextArea("Welcome to Calculator",500,100);
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		plus = new JButton("+");
		sub = new JButton("-");
		divide  = new JButton("/"); 
		equal = new JButton("=");
		mul = new JButton("*");
		setLayout(new GridLayout(5,4,10,10));		

		
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(plus);
		add(sub);
		add(mul);
		add(divide);
		add(equal);
	}
}

public class Graphics
{
	public static void main(String[] args) 
	{
		myFrame mf = new myFrame();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
