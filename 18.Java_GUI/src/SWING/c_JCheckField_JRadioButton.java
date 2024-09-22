package SWING;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

//	We can set Nemonics in Swing
//	Way of creating Radio Buttons is Different
import javax.swing.*;
class myFrame3 extends JFrame
{
	JCheckBox c1,c2;
	JRadioButton r1,r2;
	JTextField tf;
	myFrame3()
	{
		super("c_JCheckField_JRadioButton");
		tf = new JTextField("Demo Text",20);
		tf.setBounds(10,20,100,80);
		
		c1 = new JCheckBox("Bold");
		c1.setMnemonic(KeyEvent.VK_B);
		
		c2 = new JCheckBox("Italic");
		c1.setMnemonic(KeyEvent.VK_I);
		
		r1 = new JRadioButton("lower");
		r2 = new JRadioButton("UPPER");
		
		ButtonGroup bg = new ButtonGroup();				// this will ensure that only one button is added/clicked at once.
		bg.add(r1);
		bg.add(r2);
		
		c1.addActionListener(new Handler());
		c2.addActionListener(new Handler());
		r1.addActionListener(new Handler());
		r2.addActionListener(new Handler());
		
		r1.setActionCommand("lower");
		r2.setActionCommand("UPPER");
		
		setLayout(new FlowLayout());
		add(tf);
		add(c1);
		add(c2);
		add(r1);
		add(r2);
		
	}
//	For Event Handling
	class Handler implements ActionListener
	{
//		Action command usually gives the String of the command.
//		Usually it gives a level
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getActionCommand()=="lower")
			{
				tf.setText(tf.getText().toLowerCase());
			}
			else if(e.getActionCommand()=="UPPER")
			{
				tf.setText(tf.getText().toUpperCase());
			}
			int b=0 , i=0;
			if(c1.isSelected())
			{
				b = Font.BOLD;

			}
			
			if(c2.isSelected())
			{
				i = Font.ITALIC;
			}
//			Font f = new Font("Times New Roman" , Font.BOLD,15);
//			If I want Bold + Italic then 
//			This is a binary Operation or Binary Or Operation
//			Font f = new Font("Times New Roman", Font.BOLD|Font.ITALIC,15);
//			As it is a Binary Operation so I have set Bold and Italic as Integers
			Font f = new Font("Times New Roman", b|i,15);
			tf.setFont(f);
		}
		
	}
}
public class c_JCheckField_JRadioButton 
{
	public static void main(String[] args) 
	{
		myFrame3 mf = new myFrame3();
		mf.setSize(500,500);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
