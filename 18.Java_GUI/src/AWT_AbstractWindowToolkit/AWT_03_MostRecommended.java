package AWT_AbstractWindowToolkit;
import java.awt.*;
public class AWT_03_MostRecommended	extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
//	Constructor if My Frame to create a layout
	public AWT_03_MostRecommended()
	{
		super("My App");
		setLayout(new FlowLayout());				// this is important!	
		l = new Label("Name");
		tf = new TextField(20);
		b = new Button("Ok");
		
		add(l);
		add(tf);
		add(b);
//		setSize(200 , 200);
//		visibility(true);
	}
	public static void main(String[] args) 
	{
//		This method is Most Highly Recommended.
		AWT_03_MostRecommended f = new AWT_03_MostRecommended();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
