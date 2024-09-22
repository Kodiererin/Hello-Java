package Test_Name;
import java.awt.*;

import javax.swing.JFrame;
class test extends Frame
{
	Button b;
	Label l;
	TextField tf;
	public test()
	{
		super("Using Super Class");
		setLayout(new FlowLayout());
		b = new Button("Hello");
		l = new Label("This is Label");
		tf = new TextField(20);
		
		add(l);
		add(b);
		add(tf);
	}
	
	
}
public class test_Frame_EventListener 
{
	public static void main(String[] args) 
	{
		test t = new test();
		t.setSize(200,200);
		t.setVisible(true);
	}
}
