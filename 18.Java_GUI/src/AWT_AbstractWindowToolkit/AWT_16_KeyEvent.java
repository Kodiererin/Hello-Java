//	Handling Key Event
//		Key Event : When We type anything from the keyboard. We can take that also as event.
//		Java awt generates event when you type any key. TextEvent which we learned is also a key Event.
//		Key  Event can also captured into a container. and Here Frame is a container.
//		We will learn about Key events and Frame.
//		When You press a key then the pressed key then it generates Key press.
//		And when you press it and hold it then the is takes as KeyTypes which is also a kry event.
//		Key release is also an key Event.
//		KeyPresses,KeyTypes and KeyReleased is called KeyEvent?
//		When you hold the key then KeyTyped event is continously Generated but only those characters which have Unicodes (shift,tab these keys donot have Unicodes)
//		See KeyEvent in Java Docs -> Key Pressed, Key TYpes , Key Released
package AWT_AbstractWindowToolkit;
import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.Time;
class myFrame16 extends Frame implements KeyListener
{
	Label l1,l2,l3,l4;
	myFrame16()
	{
		super("Key Event Demo");
		l1 = new Label("");			// the Size of the label is equal to its String.
		l2 = new Label("");
		l3 = new Label("");
		l4 = new Label("");
		
		setLayout(null);
		
		l1.setBounds(30, 40, 100, 20);
		l2.setBounds(30, 80, 100, 20);
		l3.setBounds(30, 120, 100, 20);
		l4.setBounds(30, 140, 400, 20);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) 
	{
		l1.setText("Key Pressed");
		l2.setText("");
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		l2.setText("Key Released");
		l1.setText("");
		l3.setText("");
		l4.setText("");
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		l3.setText("Key Typed");
		l4.setText(new Date(e.getWhen())+"  "+(new Time(e.getWhen())));
	}
}
public class AWT_16_KeyEvent 
{
	public static void main(String[] args) 
	{
		myFrame16 mf = new myFrame16();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
