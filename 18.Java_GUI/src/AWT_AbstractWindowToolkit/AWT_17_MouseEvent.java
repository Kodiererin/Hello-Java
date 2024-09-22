package AWT_AbstractWindowToolkit;
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//	Events Generated Using Mouse
//	Mouse -> Entered,Exited,Clicked,Pressed., Released, Moved , Dragged
//	There  2 Listener Mouse Listener (for First 5 Listener) and the rest two are for Mouse Motion Listener
//	Check Button from java docs
import java.awt.event.MouseMotionListener;

//	getOnScreenx and getOnScreenY -> You will get the screen coordinates where the orign can be any.
//	isPopUpTrigger -> to determine if the right click is done or not.
class myFrame17 extends Frame implements MouseListener , MouseMotionListener
{
	Label l;
	Label l2;
	myFrame17()
	{
		super("Mouse Event");
		
		l = new Label("");
		setLayout(null);
		
		l2 = new Label("");
		l.setBounds(10, 50, 100, 20);
		l2.setBounds(10, 80, 100, 20);
		add(l);
		add(l2);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		l.setText("Mouse Clicked");
		
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		l.setText("Mouse Pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		l.setText("Mouse Released");
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		l.setText("Mouse Entered");
		
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		l.setText("Mouse Dragged");
		
	}
	@Override
	public void mouseMoved(MouseEvent e)
	{
		l.setText("Mouse Moved");
		l2.setText(e.getX()+","+e.getY());
	}
}
public class AWT_17_MouseEvent 	
{
	public static void main(String[] args) 
	{
		myFrame17 mf = new myFrame17();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
