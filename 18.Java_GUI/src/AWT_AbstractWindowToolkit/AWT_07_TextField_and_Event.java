package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class myFrame7 extends Frame 
{
	Label l1,l2;
	TextField tf;
	
	myFrame7()
	{
		super("TextFIeld Demo");
		l1 = new Label("No text is Entered Yet");
		tf = new TextField(20);
		l2 = new Label("Enter Key is not yet Hit");
		
		Handler h = new Handler();
		tf.addTextListener(h);
		tf.addActionListener(h);
		setLayout(new FlowLayout());
		tf.setEchoChar('x');
		
		add(l1);
		add(tf);
		add(l2);
	}

	class Handler implements TextListener,ActionListener
	{
		@Override
		public void textValueChanged(TextEvent e) 
		{
			l1.setText(tf.getText());
			
		}
		@Override
		public void actionPerformed(ActionEvent ae)
		{
			l2.setText(tf.getText());
		}
		
	}
}
public class AWT_07_TextField_and_Event 
{
	public static void main(String[] args) 
	{
		myFrame7 mf = new myFrame7();
		mf.setSize(400, 400);
		mf.setVisible(true); 
	}
}
