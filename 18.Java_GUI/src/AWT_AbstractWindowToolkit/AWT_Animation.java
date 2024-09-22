//	Just a Demo to Learn using Animation by Java.
//	Animation is Used by MultiThreading.
//	So understand MultiThreading!

package AWT_AbstractWindowToolkit;
import java.awt.*;
class myFrame26 extends Frame implements Runnable
{
//	Moving of object in animation is called Transitional.
	int x,y,tx,ty;
	myFrame26()
	{
		super("Animation");
		x = 100;
		y = 100;
		tx=ty=1;
		
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			x+=tx;
			y+=ty;
			
			if(x<=0 || x>450)			// 500 is the width of the application
				tx= tx*-1;
			if(y<=20 || y>350)
				ty = ty*-1;
			repaint();
			
			try {Thread.sleep(5);}catch(Exception e){}
		}
	}
}
public class AWT_Animation 
{
	public static void main(String[] args) 
	{
		myFrame26 mf = new myFrame26();
		mf.setSize(500,400);
		mf.setVisible(true);
	}
}
