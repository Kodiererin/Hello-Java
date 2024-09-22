package AWT_AbstractWindowToolkit;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//	RadioButton : Set of checkboxes are placed inside a group called Radio Box.

class MyFrame4 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	
	public MyFrame4()
	{
		super("Check Box Demo");
		
		l = new Label("Nothing is Selected");	
			
		cbg= new CheckboxGroup();				// here element has been added
		
		c1 = new Checkbox("Java",false,cbg);	// this is a constructor.
		c2 = new Checkbox("Python",false,cbg);	// this is a constructor.
		c3 = new Checkbox("C#",false,cbg);		// this is A constructor.
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this); 
		
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		String str = "";
		
		if(c1.getState()==true)
		{
			str = str+" "+c1.getLabel();
		}
		if(c2.getState()==true)
		{
			str = str+" "+c2.getLabel();
		}
		if(c3.getState()==true)
		{
			str = str+" "+c3.getLabel();
		}
		if(str.isEmpty())
		{
			str = "Nothing is Selected";
		}
		l.setText(str);
		
	}
}
public class AWT_05_RadioButton 
{
	public static void main(String[] args) 
	{
		MyFrame4 mf = new MyFrame4();
		mf.setSize(400, 400);
		mf.setVisible(true);
	}
}
