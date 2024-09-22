package AWT_AbstractWindowToolkit;
import java.awt.*;
public class AWT_01_FrameBasedApplications 
{
	public static void main(String[] args) 
	{
//		create a frame which will run on the desktop.
		Frame f = new Frame("My First App");		// must be familiar with the constructors.
//		 By default there are some layout set which we wil change to flow layout.
		f.setLayout(new FlowLayout());
		
		
		Button b = new Button("OK");
		Label l = new Label("Name ");
		TextField tf = new TextField(20);
		
		
		f.add(l);
		f.add(tf);
		f.add(b);
//		now we will set the size of the button.
		
		
		f.setSize(300,300);
		f.setVisible(true);
//		it will not close for closing we have to write some codes.
		
	}
}
