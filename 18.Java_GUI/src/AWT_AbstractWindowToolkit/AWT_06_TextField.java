package AWT_AbstractWindowToolkit;
//	Text Field and Even handler of Text Field.

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.Action;

import java.awt.*;

class MyFrame5 extends Frame implements TextListener,ActionListener
{
	Label l1,l2;
	TextField tf;
	
	MyFrame5()
	{
		super("Text Field Demo");
		
		l1 = new Label("No Text is Entered Yet");
		l2 = new Label("Enter Key is Not yet Hit");
		tf = new TextField(20);
		
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);
		
//		tf.setEchoChar(*);		// this is for passwords.
	}

	@Override
	public void textValueChanged(TextEvent e) 
	{
		l1.setText(tf.getText());
	}
	public void actionPerformed(ActionEvent e)
	{
		l2.setText(tf.getText());
	}
}
public class AWT_06_TextField 
{
	public static void main(String[] args) 
	{
		MyFrame5 f = new MyFrame5();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
