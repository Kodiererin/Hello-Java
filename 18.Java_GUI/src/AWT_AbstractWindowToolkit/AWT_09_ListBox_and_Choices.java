package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class myFrame9 extends Frame
{
//	list box :  item even and action event
//	item event :  its is generated when you selecting any item
//	action event : when you select an item and hit enter
//	 in listbox we can select multiple item but in check box we can select one item
//	if many check box the go for list box
//	if you have many radio button go for choice	
	
	List l;				// for list box
	Choice c;
	TextArea ta;
	myFrame9()
	{
		super("List Box and Text Area");
		l = new List(4,true);		
//		4 means window size
//		true means multiple items can be selected.
//		false means : when you want that one items must be selected.
		c = new Choice();
		ta = new TextArea(20,30);
//		20 - rows and 30 columns, means 20 lines and 30 words.
		
		Handler h = new Handler();
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		
//		for choices we will add
		
		c.add("January");
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		c.add("June");
		c.add("July");
		c.add("September");
		c.add("October");
		c.add("November");
		c.add("December");		
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c);
		add(ta);
		
		l.addItemListener(h);
		c.addItemListener(h);
		l.addActionListener(h);
	}
	class Handler implements ActionListener,ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
//			I want to do that whichever component is selected I wnt to show them in the list box
			if(e.getSource()==l)
			{
				ta.setText(l.getSelectedItem());		// there might be a problem in this implemented method
			}
			else
			{
				ta.setText(c.getSelectedItem());
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String list[] = l.getSelectedItems();
			
			String txt = "";
			
			for(int i=0 ; i<list.length ; i++)
			{
				txt = txt+list[i]+"\n";
			}
			ta.setText(txt);
			
//			Select multiple items and hit enter you will see every String 
//			Listbox has more methods than choice but you will se that every method of choice is there in ListBox
		}
		
	}
}
public class AWT_09_ListBox_and_Choices 
{
	public static void main(String[] args) 
	{
		myFrame9 mf = new myFrame9();
		mf.setSize(400,400);
		mf.setVisible(true);
//		System.out.println("Hello World");
	}
}