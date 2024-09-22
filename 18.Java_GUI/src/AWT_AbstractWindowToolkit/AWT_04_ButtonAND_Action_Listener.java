package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyFrame2 extends Frame implements ActionListener
{
	int count=0;
	Label l;
	Button b;
	
	public MyFrame2()
	{
		super("Button Demo");
		l = new Label("    "+count);		// label size will be no of spaces + count
		b = new Button("Click");
		
		setLayout(new FlowLayout());
		{
			add(l);
			add(b);
//			b.addActionListener(null); 			// this method is for adding event
												// get action command anf get command tells which button is pressed return type is string
			b.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 		// when a button is pressed then it will e given here as a callback.
	{
		// TODO Auto-generated method stub
		count++;
//		I have to show in label so How I WILL SHOW"
		
		l.setText("    "+count);
		
	}
}

public class AWT_04_ButtonAND_Action_Listener 
{
	public static void main(String[] args) 
	{
		MyFrame2 f = new MyFrame2();
		f.setSize(200,200);
		f.setVisible(true);
	}
}
