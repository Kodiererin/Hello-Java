//	Swing Suppports Swing pane, Split pane allows to split the window into two pane.
//	Either vertically or Horizontally.
//	JPane , JFrame  JLabel and ListSelectionListener is Used


//		This is a Split Pane application.
package SWING;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class myFrame8 extends JFrame
{
//	taking references
	JSplitPane sp;
	JList list;						// reference of a List Component
	JLabel lbl;
	
	
	myFrame8()
	{
		super("Split Demo");
		String cols[] = {"red","green","yellow","magenta","orange","black"};
		
		list = new JList(cols);
		list.setSelectedIndex(0);
//		Adding Listeners.
		list.addListSelectionListener(new Handler());
		
		
//		Model and View(Google IT)
		JScrollPane p1 = new JScrollPane(list);
		
		lbl = new JLabel(" ");
		lbl.setOpaque(true); 				// it will be visible
		lbl.setBackground(Color.red);
		
		JScrollPane p2 = new JScrollPane(lbl);
		
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
		sp.setDividerLocation(200);
		add(sp);
		
	}
	
	class Handler implements ListSelectionListener
	{
		@Override
		public void valueChanged(ListSelectionEvent e) 
		{
			String str = (String)list.getSelectedValue();
			
			switch(str)
			{
			case "red": lbl.setBackground(Color.red);
				break;
			case "green": lbl.setBackground(Color.green);
			break;
			case "yellow": lbl.setBackground(Color.yellow);
			break;
			case "magenta": lbl.setBackground(Color.magenta);
			break;
			case "orange": lbl.setBackground(Color.orange);
			break;
			case "black": lbl.setBackground(Color.black);
			break;
			}
		}
	}
}
public class h_SplitPane 
{
	public static void main(String[] args) 
	{
		myFrame8 mf = new myFrame8();
		mf.setSize(800,800);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
