
package AWT_AbstractWindowToolkit;

import java.awt.*;
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myFrame18 extends Frame implements ItemListener
{
	private static final Object BorderLayout = null;

	Button b1,b2,b3,b4;
	
	TextField t1,t2,t3,t4;
	
	Panel p1,p2;
	Panel cp;					//for checkbox
	Panel mainP;					// for main Panel
	
	
	Checkbox c1,c2;
	
	CardLayout cl;
	
	myFrame18()
	{
		super("CardLayout Demo");
		BorderLayout bL = new BorderLayout();
		CheckboxGroup cbg = new CheckboxGroup();
		
		c1 = new Checkbox("One",true,cbg);
		c2 = new Checkbox("Two",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		b1 = new Button("One");
		b2 = new Button("Two");
		b3 = new Button("Three");
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		
		cp = new Panel();
		cp.add(c1);				// Default layout of the panel is the flow layout so they will be side by side
		cp.add(c2);
		
		p1 = new Panel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		p2 = new Panel();
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		mainP = new Panel();
		cl = new CardLayout();
		mainP.setLayout(cl);
		mainP.add("One",p1);
		mainP.add("Two",p2);
		
		add(cp,bL.NORTH);
		add(mainP,bL.CENTER);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(c1.getState())
		{
			cl.first(mainP);
		}
		else
		{
			cl.last(mainP);
		}
	}
}
public class AWT_19_Card_layout 
{
	public static void main(String[] args) 
	{
		myFrame18 mf = new myFrame18();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
