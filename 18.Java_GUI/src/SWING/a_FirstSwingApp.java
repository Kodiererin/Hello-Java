package SWING;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//	Creating a Basic application for counting how many time a button is clicked.
//	By layout the default layout is Border Layout.
//	The app. doesnot get automatically stopped We have to stop.
class myFrame1 extends JFrame
{
	JButton b;
	JLabel l;
	int count=0;
	myFrame1()
	{
		super("First App");
		setLayout(new FlowLayout());
		l = new JLabel("Clicked "+count+" times");
		b = new JButton("Clicked");
		add(l);
		add(b);
//		add(new JButton("Cancel"));				// Enter will not work but default button will respond to enter
		
//		use of image as a button
		b.setIcon(new ImageIcon("C:/Users/Ujjwal/Ujjwal_Eclipse/18.Java_GUI/src/SWING/Images/check-circle.gif"));
		l.setToolTipText("Counter");			// when you take your cursor over there then text will be displayed.
		b.addActionListener(new Handler());
		
		getRootPane().setDefaultButton(b);		// when I hit enter also then also the button is going to respond.
//		I want that this button is the complete pain off the fraim window
	}
	class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			count ++;		
			l.setText("Clicked "+count+" times");
		}
		
	}
}

public class a_FirstSwingApp 
{
	public static void main(String[] args) 
	{
		myFrame1 mf = new myFrame1();
		mf.setSize(400,400);
		mf.setVisible(true);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// automatically closes and exits the code.
//		So it doesnot run in background.
//		In swing closing is very easy.
	}
}
