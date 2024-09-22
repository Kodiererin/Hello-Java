//	Slider Is used to set a data and Progress bar is given to show the user how much work is completed.

package SWING;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.desktop.AboutHandler;
import java.util.logging.Handler;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;

class myFrame10 extends JFrame implements ChangeListener
{
	JSlider sl;
	JPanel p1,p2;
	JProgressBar pb;
	
	int w = 50;
	myFrame10()
	{
		super("JSliderBar and JProgrsss Bar");
		sl = new JSlider(0,100,50);
		sl.setMajorTickSpacing(10);
		sl.setMinorTickSpacing(1);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
		
		pb = new JProgressBar();
		pb.setString("50%");
		pb.setStringPainted(true);
		
		p1 = new JPanel() {
//		we have to override Paint component
//			It is a extended JPanel
		public void paintComponent(Graphics g)
		{
			g.drawOval(200, 200, w, w);;
		}
	};
	
	p2 = new JPanel();
	p2.add(pb);
	
	
	add(sl,BorderLayout.NORTH);
	add(p1,BorderLayout.CENTER);
	add(p2,BorderLayout.SOUTH);
	pb.setIndeterminate(false);
	pb.setStringPainted(true);
	
	sl.addChangeListener(this);
	
	}
	@Override
	public void stateChanged(ChangeEvent e) 
	{
		// TODO Auto-generated method stub
		w = sl.getValue();
		p1.repaint();
		pb.setString(w+"%");

	pb.setValue(w);
	}
}
public class i_JSlider_JProgressBar 
{
	public static void main(String[] args) 
	{
		myFrame10 mf = new myFrame10();
		mf.setSize(800,800);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
