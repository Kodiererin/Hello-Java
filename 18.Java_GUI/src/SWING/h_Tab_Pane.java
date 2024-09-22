package SWING;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class myFrame9 extends JFrame
{
//	taking references
	JSplitPane sp;
	JList list;						// reference of a List Component
	JLabel lbl;
	
	
	myFrame9()
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
		
//		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
//		sp.setDividerLocation(200);
		
//		Changes are being done here.
		
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Colors", p1);
		tp.addTab("Label", p2);
		add(tp);
		
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
public class h_Tab_Pane
{
	public static void main(String[] args) 
	{
		myFrame9 mf = new myFrame9();
		mf.setSize(800,800);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
