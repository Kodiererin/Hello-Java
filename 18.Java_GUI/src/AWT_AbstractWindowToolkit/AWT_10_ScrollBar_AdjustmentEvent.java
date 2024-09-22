package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.applet.*;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
//	The Event generated on the Scroll Bar is a Adjustment Event.

class myFrame10 extends Frame
{
	Scrollbar red,green,blue;
	TextField tf;
	myFrame10()
	{		
		super("Scroll Bar Demo");
		
		red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);			// VIsit Java Docs for more knowledge (ek baar dekh lena)
		blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);			// VIsit Java Docs for more knowledge (ek baar dekh lena)
		green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);			// VIsit Java Docs for more knowledge (ek baar dekh lena)
		
		tf = new TextField(20);
		
//		lets  set the boundaries of the Scroll Bar
		tf.setBounds(50, 100, 300, 50);			// be careful and understand it.
		red.setBounds(50,150,300,30);			// ye zaruri h.
		green.setBounds(50,200,300,30);			// ar components ar coordinates ke baaare me janna
		blue.setBounds(50,250,300,30);
		
		setLayout(null);
		add(tf);
		add(red);
		add(green);
		add(blue);
		
		Handler h = new Handler();
		
		red.addAdjustmentListener(h);
		blue.addAdjustmentListener(h);
		green.addAdjustmentListener(h);
	}
	class Handler implements AdjustmentListener
	{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) 
		{
			// TODO Auto-generated method stub
//			whatever the value of Red Green Blue, I have to take those values and Set the color of text Field
			tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
//			But this Listener must be registered with the scroll bar then Only It will work. ie Generate the Event.
		}
//		This is a functional Interface, if there is single method in an Interface
//		THen we call it Functional Interface
		
	}
	
	
}
public class AWT_10_ScrollBar_AdjustmentEvent extends Frame
{
	public static void main(String[] args) 
	{
		myFrame10 e = new myFrame10();
		e.setSize(500,500);
		e.setVisible(true);
	}
}


//	The Button in the Scroll bar is called Tracker
//	THe arrow buttons are called Unit Increment and unit Decrement
//	Block decrement and BLock Decrement (Google It).

//	Always refer for Java Docs bar.