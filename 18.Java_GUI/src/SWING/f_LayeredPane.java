//	Swing Provides layer Pane where you can arrange the components on one anotherin the form of layers.
//	We can arrange in 3 Dimensions.
//	

package SWING;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

class myFrame6 extends JFrame
{
	JLayeredPane lp;
	JRadioButton r1,r2,r3;
	JLabel l1,l2,l3,l4;
	
	myFrame6()
	{
		super("Layered Panels");
		r1 = new JRadioButton("Red");
		r2 = new JRadioButton("Green");
		r3 = new JRadioButton("Blue",true);
		
		r1.addActionListener(new Handler());
		r2.addActionListener(new Handler());
		r3.addActionListener(new Handler());
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		JPanel p1 = new JPanel();
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		
		l1 = new JLabel("Red");
		l1.setBounds(10, 10, 200, 200);
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		
		l2 = new JLabel("Green");
		l2.setBounds(50, 50, 250, 250);
		l2.setBackground(Color.green);
		l2.setOpaque(true);
		
		l3 = new JLabel("Blue");
		l3.setBounds(70, 70, 300, 300);
		l3.setBackground(Color.blue);
		l3.setOpaque(true);
		
		l4 = new JLabel("b");
		l4.setBounds(100, 100, 150, 150);
		l4.setBackground(Color.black);
		l4.setOpaque(true);
		
		lp = new JLayeredPane();
		
		lp.add(l1 , new Integer(0));
		lp.add(l2 , new Integer(1));
		lp.add(l3 , new Integer(2));

		lp.add(l4 , new Integer(3));
		
		add(p1,BorderLayout.NORTH);
		add(lp,BorderLayout.CENTER);
		
		addMouseMotionListener(new MouseAdapter()
		{
			public void mouseMoved(MouseEvent me)
			{
				l4.setLocation(me.getX() , me.getY());
			};
		});

	}
	
	class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(r1.isSelected())
			{
				lp.setLayer(l4, 1);
			}
			else if(r2.isSelected())
			{
				lp.setLayer(l4, 2);
			}
			else
			{
				lp.setLayer(l4, 3);
			}
		}
		
	}
}

public class f_LayeredPane 
{
	public static void main(String[] args) 
	{
		myFrame6 mf = new myFrame6();
		mf.setSize(800,800);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
