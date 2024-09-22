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
import java.awt.Frame;

class myFrame12 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	myFrame12()
	{
		super("Flow Layout");
		b1 = new Button("One ");
		b2 = new Button("Two  ");
		b3 = new Button("Three");
		b4 = new Button("Four ");
		b5 = new Button("Five ");
		b6 = new Button("Six ");
		
		FlowLayout fl = new FlowLayout();
//		there are various methods so that I can set the adjusments needed for setting the alignment
		fl.setAlignment(FlowLayout.RIGHT);		// by default the layout is centre aligned which we have to change.
//		to set the gap between buttons.
		fl.setHgap(100);
		setLayout(fl);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
//		if I change the size then the Buttons automatically adjust itself!
	}
}
public class AWT_12_FlowLayout 
{
	public static void main(String[] args) 
	{
		myFrame12 mf = new myFrame12();
		mf.setSize(400,400);
		mf.setVisible(true);
	}

}
