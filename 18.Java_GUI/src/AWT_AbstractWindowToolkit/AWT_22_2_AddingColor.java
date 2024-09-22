package AWT_AbstractWindowToolkit;
//	Adding Color For The Circle Shape
//	See Color Class in Java Docs
//	Color is a seperate class which is available in Java.awt
//	Colors are predefined in the Color class which can be used irrepective of the color class.
//	We can also make the color by mixing the Red Green Blue values.
//	there are many constructors to define color.
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class myFrame25_2 extends Frame
{
	int x,y;			// to store the co-ordinates
	myFrame25_2()
	{
		super("Painting-Color-Fonts");
		
//		addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent me)
//		To track the cursor so that the graphics changes by moving the cursor
			addMouseMotionListener(new MouseAdapter() {
				public void mouseMoved(MouseEvent me)
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
		g.setColor(Color.red);		// oval is in red color.
//		g.drawOval(x, y, 50, 50); 		// x and y are coordinates and 50 50 are the height and width
//		g.fillOval(x, y, 50, 50); 		// x and y are coordinates and 50 50 are the height and width
//		to add Font : 
//		For font java Also has a class 
		g.setFont(new Font("Times New Roman",Font.BOLD,30));
//		30 is the size of the Font
		g.drawString("Hello User", x, y);
	}
}
public class AWT_22_2_AddingColor 
{
	public static void main(String[] args) 
	{
		myFrame25_2 mf = new myFrame25_2();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
