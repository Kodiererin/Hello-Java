package SWING;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class myFrame11 extends JFrame
{	
//	We will be making Spinners,List and ComboBox
	
	JComboBox cb;
	JList list;
	JSpinner sp1,sp2;
	JTextField tf;
	
	myFrame11()
	{
		super("Spinner Demo");
		
//		We need data for Combobox and for that we have to create an array for add data to it.
//		The data will be shown in the combobox, and the data inside the combobox is known as Model.
		String countries[] = {"India","Australia","UK","US","Canada"};
		
//		We also need data for JList so we will create one more array for adding data to it.
		String months[] = {"January","February","March","April","May","June","July"	};	// and so on
		
//		Second spinner was having days name so I have to declare an array of String.
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
//		For list of countries I will create a Combobox
		
		cb = new JComboBox(countries);		// array has been given as a parameter

//		ComboBox data is called view and event handling is called Contoller ie: The activity is called Controller.
//		The Activity is called controller.
//		The visual thing is Called view.
//		And the list is called Data.
//		Overall this is Called MVC (Model View Controller) Swing in Java is Called MVC architecture in Swing.
//		MVC is used for Bigger applications.
		
		list = new JList(months);
		list.setVisibleRowCount(5);
//		5 elements will be visible in the row Pane.
		tf = new JTextField(15);
		
		sp1 = new JSpinner(new SpinnerNumberModel(1, 1,31 , 1));
//		1 Initial No ,
//		1,31 Limit,
//		1 How much will be incremented.when the spinner is clicked
		sp2 = new JSpinner(new SpinnerListModel(days));
		
		setLayout(new FlowLayout());
		add(cb);
		add(sp1);
		add(sp2);
		add(new JScrollPane(list));		// adding the scroll bar
		add(tf);
		
		cb.addActionListener(new Handler());
		list.addListSelectionListener(new Handler());
		sp1.addChangeListener(new Handler());
		sp2.addChangeListener(new Handler());
	}
	
	class Handler implements ActionListener, ListSelectionListener, ChangeListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			tf.setText((String)cb.getSelectedItem());
//			getSelectedItem returns an object so I am typecasting it to string
		}

		@Override
		public void valueChanged(ListSelectionEvent e) 
		{
			// TODO Auto-generated method stub
			tf.setText((String)list.getSelectedValue());
//			getSelectedValue returns an object so I am typecasting it to string
			
		}

		@Override
		public void stateChanged(ChangeEvent e) 
		{
			// TODO Auto-generated method stub
			if(e.getSource()==sp1)						// lets Begin KEm cho MOt
			{
				tf.setText(sp1.getValue()+" ");
			}
			else
			{
				tf.setText((String) sp2.getValue());
			}
		}
		
	}
}
public class j_List_ComboBox_Spinner 
{
	public static void main(String[] args) 
	{
		myFrame11 mf = new myFrame11();
		mf.setVisible(true);
		mf.setSize(300,300);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
