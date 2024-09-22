package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//	Window Event : 
//	When I open a new Window : Window Event Event
//	Window Closed : to close the Window (when I am clicking the red X button then It closes the operation and then closes the Event)
//	When I open another windows that overlaps the previous window the the color changing when the window is active and deactivate then that thing is an another Event.
//	Windows iconified : minimise && Windows DeIconified : maximize
//	Window Listener has 7 mwthods wich which you  either implement or dont implement you have to write it
class myEvent18 extends Frame implements WindowListener
{
	Label l;
	myEvent18()
	{
		super("Window Listener");
		l = new Label("This IS Label");
		
		setLayout(new FlowLayout());
		add(l);
		
		addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Opened");
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Closing");
		System.exit(0); 				// 0 means no error
	}
	@Override
	public void windowClosed(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Closed");
	}
	@Override
	public void windowIconified(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Iconified");
	}
	@Override
	public void windowDeiconified(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window DeIconiFied");
	}
	@Override
	public void windowActivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Activated");
	}
	@Override
	public void windowDeactivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		l.setText("Window Deactivated");
	}
}
public class AWT_18_HandlingWindowEvent 
{
	public static void main(String[] args) 
	{
		myEvent18 e = new myEvent18();
		e.setSize(400,400);
		e.setVisible(true);
	}

}
