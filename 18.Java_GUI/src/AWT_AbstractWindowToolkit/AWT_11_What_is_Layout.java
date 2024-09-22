package AWT_AbstractWindowToolkit;
import java.awt.*;
//	Layout Managers : (Google It.) 
//	Using Layout managers, We can deign our form, design, which compeonent at which place, where there should be arranged.
//	Those arrangements can be done by Layout Managers.
//	JAVA has built in Layout Managers which we can learn those Layout Managers.
//	1. Flow Layout : It arranges the components from left to right. and Once it reaches to the End of the Frame then it will start filling the components from the next line.
//		Default Alignment is Centre ALignment which we ca change from centre to left or right alignment.
//	2. Border Layout : For Frame the Default layout is Border layout. It has regions East,west,north,south. I can show only 5 components!.
//	3. Grid Layout : Ccomponets will be arrranged in Grid Structure(Like number in Matrix). 3x3 will be 6 grid.
//					but we cannot skip any cell to be empty
//	4. Grid Bag Layout : Just like grid, but we can skip any cell to be empty.
//	5. CardLayout : We can have diffent cards and we can visible/hide cards.
//						The idea of cards is just like tabs.

class myFrame11 extends Frame
{
	myFrame11()
	{
		
	}
}
public class AWT_11_What_is_Layout 
{
	public static void main(String[] args) 
	{
		myFrame11 mf = new myFrame11();
		mf.setSize(500,500);
		mf.setVisible(true);
	}
}
