package SWING;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class myFrameX extends JFrame
{
	JToolBar tb;
	JButton b1,b2,b3b4,b5,b6,b7;
	JTextArea ta;
	myFrameX()
	{
		super("JFrame");
		
	}
}

public class k_JMenuBarJToolBar 
{
	public static void main(String[] args) 
	{
		myFrameX mf = new myFrameX();
		mf.setVisible(false);
		mf.setSize(400,400);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
