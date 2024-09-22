package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame3 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	
	public MyFrame3()
	{
		super("Check Box Demo");
		
		l = new Label("Nothing is Selected");
		c1 = new Checkbox("Java");
		c2 = new Checkbox("Python");
		c3 = new Checkbox("C#");
		
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
public class AWT_05_CheckBox 
{
	public static void main(String[] args) 
	{
		MyFrame3 my = new MyFrame3();
		my.setSize(400, 400);
		my.setVisible(true);
		
	}
}
