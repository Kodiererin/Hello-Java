package AWT_AbstractWindowToolkit;
import java.awt.*;
class myFrame15 extends Frame
{
//	in GridBagLayout we can set components by x and y axis. 
//	it is easy and can be done.
//	we can manupulate components 
//	gridBackConstrats - using this we can set the axis (x,y) to set the components
	Button b1,b2,b3,b4,b5,b6;
	myFrame15()
	{
		super("GridBag Layout");
		
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gb);
		
		
		b1 = new Button("One ");
		b2 = new Button("Two  ");
		b3 = new Button("Three");
		b4 = new Button("Four ");
		b5 = new Button("Five ");
		b6 = new Button("Six ");
		 
//		gbc = grid back component 
		
		gbc.gridx=1;
		gbc.gridy=1;
		add(b1,gbc);

		gbc.gridx=3;
		gbc.gridy=1;
		add(b2,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		add(b3,gbc );
		
		gbc.gridx=4;
		gbc.gridy=2;
		add(b4,gbc);
		
		gbc.gridx=2;
		gbc.gridy=3;
		add(b5,gbc); 
		
		gbc.gridx=1;
		gbc.gridy=4;
		add(b6,gbc);
//		lets add one more buttons
//		add(new Button("Seven"));		// this button is not in gbc so it is outside
	}
}
public class AWT_15_GridBagLayout 
{
	public static void main(String[] args) 
	{
		myFrame15 f = new myFrame15();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
