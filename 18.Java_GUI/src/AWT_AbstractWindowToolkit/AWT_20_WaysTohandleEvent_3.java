package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// By using Lambda Expression
class myFrame21_2 extends Frame
{
	TextField tf;
	Button b1;
	int count =0;
	myFrame21_2()
	{
		super("Different Ways to Handle to Event");
		
		tf = new TextField("0");
		b1 = new Button("Click Here to Increase Count");
		
		setLayout(new FlowLayout());
		add(tf);
		add(b1);
//		THis is the Anonymous Class. or Inner Class
//		I am not creating object of an Interface but I am overriding the Method of an Interface to define some anonymous class.
//		Method of Implementation is Different but the Working is Same.
		b1.addActionListener((ActionEvent e)->
			{
			count++;
			tf.setText(String.valueOf(count));
			});
	}
}
//	Second Method to Implement The Action Listener
public class AWT_20_WaysTohandleEvent_3
{
	public static void main(String[] args) 
	{
		myFrame21 mf = new myFrame21();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}