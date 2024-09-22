//	Developing Frame based Application #2 
//	And it will be better if you follow this Method.


package AWT_AbstractWindowToolkit;

import java.awt.*;

//	Our own class to create a frame.

class MyFrame extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
//	Constructor if My Frame to create a layout
	public MyFrame()
	{
		super("My App");
		setLayout(new FlowLayout());
		l = new Label("Name");
		tf = new TextField(20);
		b = new Button("Ok");
		
		add(l);
		add(tf);
		add(b);
//		setSize(200 , 200);
//		visibility(true);
	}
}

public class AWT_02_Recommended_Method
{
	public static void main(String[] args) 
	{
//		This method is Highly Recommended.
		MyFrame f = new MyFrame();
		f.setSize(400,400);
		f.setVisible(true);
		
	}
}
