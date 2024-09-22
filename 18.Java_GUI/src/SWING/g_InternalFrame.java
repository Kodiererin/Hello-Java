//	Internal Frame : Internal Frame is the JInternal frame which is a class provided
//	by the Swing.
//	If I open Multiple frames then it can open Only One JFrame.
//	Requirements : JFrame , JDesktopFrame (JDesktopFrame allows us to get/use multiple Frames which is mandatory).

package SWING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


class myInternalFrame extends JInternalFrame
{
//	Developing my own class adding extra functionality.
	JTextArea ta;
	JScrollPane sp;
	static int count =0;
	
	myInternalFrame()
	{
		super("Document "+(++count),true,true,true,true);
//			This frame becomes minimizable,iconizable,resizeable and so on.
			ta = new JTextArea();
			sp = new JScrollPane();
			add(sp);
			
			JMenuBar mb = new JMenuBar();
			JMenu file = new JMenu("File");
			JMenuItem m1 = new JMenuItem("Save");
			
			file.add(m1);
			mb.add(file);
			setJMenuBar(mb);
			
			setSize(300,300);
			setLocation(50,50);
//			Everytime  I create an object of Internal frame it will open @ default Location
			setVisible(true);
	}
}
class myFrame7 extends JFrame
{
	JDesktopPane jp;
	
	
	myFrame7()
	{
		super("Internal Frame");
		
		jp = new JDesktopPane();
		setContentPane(jp);
		
		JMenuBar mb = new JMenuBar();
		JMenu d = new JMenu("Document");
		JMenuItem m1 = new JMenuItem("New");
		
		d.add(m1);
		mb.add(d);
		setJMenuBar(mb);
	
		Handler h = new Handler();
		m1.addActionListener(h);
	}
	class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			myInternalFrame mi = new myInternalFrame();
			jp.add(mi);
		}

	}
	
}
public class g_InternalFrame 
{
	public static void main(String[] args) 
	{
		myFrame7 mf = new myFrame7();
		mf.setSize(800,800);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
