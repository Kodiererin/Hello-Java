package SWING;
import java.awt.FlowLayout;

import javax.swing.*;

class myFrame12 extends JFrame
{
//	Menu and Tool Bar.
//	Swing is having class for JMenu and JToolBar
//	We can set numenocis : Shortcut on the Menu Bar.
	
	JToolBar tb;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextArea ta;

	myFrame12()
	{
		super("JMenuBar and JToolBar");
		tb = new JToolBar();
		
		b1 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-save-30.png"));
		b2 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-open-24.png"));
		b3 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-new-24.png"));
		b4 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-cut-24.png"));
		b5 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-copy-24.png"));
		b6 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-split-24.png"));
		b7 = new JButton(new ImageIcon("/18.Java_GUI/src/SWING/Image/icons8-close-24.png"));
		
		tb.add(b1);
		tb.add(b2);
		tb.add(b3);
		
//		Adding a seperator so that some elements in the toolbar is seperated.
		tb.add(new JToolBar.Separator());		
		
		tb.add(b4);
		tb.add(b5);
		tb.add(b6);
		tb.add(b7);
		
		setLayout(new FlowLayout());
		add(tb);
	}
}

public class k_JMenuBar_JToolBar 
{
	public static void main(String[] args) 
	{
		myFrame12 mf = new myFrame12();
		mf.setSize(400,400);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
