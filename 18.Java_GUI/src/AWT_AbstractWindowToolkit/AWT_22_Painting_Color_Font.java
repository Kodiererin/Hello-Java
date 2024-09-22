package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class myFrame25_1 extends Frame
{
	int x,y;			// to store the co-ordinates
	myFrame25_1()
	{
		super("Painting-Color-Fonts");
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me)
			{
				x = me.getX();
				y = me.getY();
//				We cannot call paint method directly.
//				we have to call method repaint()
				repaint();
//				If i call paint method directly then I have to knwo Graphics G is although we dont know that!
//				So java created repaint() which recalls repaint methods directly.
			}
		});
	}
	
//	frame is is a container which we will override contain Paint_Method
	
	public void paint(Graphics g)	// Graphics is a class which is used to doing Graphic to a frame
	{
		g.drawOval(x, y, 50, 50); 		// x and y are coordinates and 50 50 are the height and width
	}
}
public class AWT_22_Painting_Color_Font 
{
	public static void main(String[] args) 
	{
		myFrame25_1 mf = new myFrame25_1();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
