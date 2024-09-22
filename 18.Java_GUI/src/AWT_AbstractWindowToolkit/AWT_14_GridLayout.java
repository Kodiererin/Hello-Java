package AWT_AbstractWindowToolkit;
import java.awt.*;

class myFrame14 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	myFrame14()
	{
		super("Grid Layout");
		b1 = new Button("One ");
		b2 = new Button("Two  ");
		b3 = new Button("Three");
		b4 = new Button("Four ");
		b5 = new Button("Five ");
		b6 = new Button("Six ");
		
//		as the default layout is Border layouw so we are changing layout
		setLayout(new GridLayout(3,3));		// 3 rows and 3 columns
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
//		lets add one more buttons
		add(new Button("Seven"));
	}
	
}
public class AWT_14_GridLayout
{
	public static void main(String[] args) 
	{
		myFrame14 f = new myFrame14();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
