package SWING;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
//	Border allows to enclose the elements and make the layout beautiful.
class myFrame4 extends JFrame
{
	JLabel l;
	JTextField tf;
	JButton b;
	
	JPanel p;
	
	myFrame4()
	{
		super("Border-Swing");
		
		l = new JLabel("Name");
		tf = new JTextField(20);
		b = new JButton("Ok");
		p = new JPanel();
		
		p.add(l);
		p.add(tf);
		p.add(b);
		
//		lets attach border
		
//		Border b = BorderFactory.createLoweredBevelBorder();
//		p.setBorder(b);

//		Border b2 = BorderFactory.createRaisedBevelBorder();
//		p.setBorder(b2);
		
//		Border b = BorderFactory.createBevelBorder(BevelBorder.RAISED);
//		p.setBorder(b);
		
//		Border b = BorderFactory.createEtchedBorder();
//		p.setBorder(b);
		
		Border b = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Login");
		p.setBorder(b);
		
		
		setLayout(new FlowLayout());
		add(p);
	}
}
public class d_Border 
{
	public static void main(String[] args) 
	{
		myFrame4 mf = new myFrame4();
		mf.setSize(400,400);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
