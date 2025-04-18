package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//	Different Ways to Handle the Event Listener.
//	#1. Frame Class as Listener.
//	#2. Inner Class
//	#3. Using Anonymous Class
//	#4. Lambda Expression 

class myFrame21_4 extends Frame
{
	TextField tf;
	Button b1;
	int count =0;
	myFrame21_4()
	{
		super("Different Ways to Handle to Event");
		
		tf = new TextField("0");
		b1 = new Button("Click Here to Increase Count");
		
		setLayout(new FlowLayout());
		add(tf);
		add(b1);
		
		b1.addActionListener(new MyListener());
	}
	
	class MyListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
//		whenever a button is clicked then count++ and text field must be updated.
			count++;
//		tf.setText(count+" ");
//		we can also write 
			tf.setText(String.valueOf(count));
		}
	}
}
//	Second Method to Implement The Action Listener
public class AWT_20_WaysTohandleEvent_4
{
	public static void main(String[] args) 
	{
		myFrame21_4 mf = new myFrame21_4();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}