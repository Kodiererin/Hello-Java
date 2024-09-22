package AWT_AbstractWindowToolkit;
import java.awt.*;
//Layout Managers : (Google It.) 
//Using Layout managers, We can deign our form, design, which compeonent at which place, where there should be arranged.
//Those arrangements can be done by Layout Managers.
//JAVA has built in Layout Managers which we can learn those Layout Managers.
//1. Flow Layout : It arranges the components from left to right. and Once it reaches to the End of the Frame then it will start filling the components from the next line.
//	Default Alignment is Centre ALignment which we ca change from centre to left or right alignment.
//2. Border Layout : For Frame the Default layout is Border layout. It has regions East,west,north,south. I can show only 5 components!.
//3. Grid Layout : Ccomponets will be arrranged in Grid Structure(Like number in Matrix). 3x3 will be 6 grid.
//				but we cannot skip any cell to be empty
//4. Grid Bag Layout : Just like grid, but we can skip any cell to be empty.
//5. CardLayout : We can have diffent cards and we can visible/hide cards.
//					The idea of cards is just like tabs.

//	---------------BORDER-LAYOUT---------------------

//	Birder layout is the Default layout manager.
//	SO I dont have to set anything.

class myFrame13 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	myFrame13()
	{
		super("Border Layout");
		b1 = new Button("One ");
		b2 = new Button("Two  ");
		b3 = new Button("Three");
		b4 = new Button("Four ");
		b5 = new Button("Five ");
		b6 = new Button("Six ");
//		Border layout is the Default layout manager.
//		SO I dont have to set anything.

		
		add(b1,BorderLayout.NORTH);
//		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
//		I dont have space So I will not add it.
		add(b6);
//		This is not the way to set Border Layout
		
//		Panel is also a container, it can also have components.
//		The Default layout manager of Panel is flow Layout.
//		So we have created anonymous buttons.
		Panel p = new Panel();	
		
//		Changing layout at last just to look the app good. This we will understand later.
//		p.setLayout(new GridLayout());
		p.setLayout(new GridLayout(3,1));		// 3,1 means 3 rows and 1 column
		
		p.add(new Button("Monday"));
		p.add(new Button("Tueday"));
		p.add(new Button("Wednesday"));
//		I have commented out the East Button 
		add(p,BorderLayout.EAST);			// add means add to a frame.
	}
}
public class AWT_13_BorderLayout 
{
	public static void main(String[] args) 
	{
		myFrame13 mf = new myFrame13();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
