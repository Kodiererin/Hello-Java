package AWT_AbstractWindowToolkit;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//	Adapter Class are alternate for Listeners.
//	Problem in Listener : They have few Methods, Window Listener have 7 methods which must be Overrided or my class my abstract.
//	So to adapt such problems Java has provides some Classes.
//	Like for WindowListener : Window Class has been given.
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class myFrame20 extends Frame
{
	myFrame20()
	{
		super("Adapter Demo");
		addWindowListener(new MyWindowAdapter());
	}
//	We can write the MyWindowAdapter class inside or outside of the class.
//	class MyWindowAdapter extends WindowAdapter
//	{
//		public void windowClosing(WindowEvent e)
//		{
//			System.exit(0);
//		}
//	}
}
public class AWT_20_AdapterClass
{
	public static void main(String[] args) 
	{
		myFrame20 mf = new myFrame20();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
