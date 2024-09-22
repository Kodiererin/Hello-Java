package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class myFrame8 extends Frame 
{
	TextArea ta;
	TextField tf;
	Label l;
	Button b;
	myFrame8()
	{
		super("Title : Text Area Demo");
		l = new Label("No Text Entered          ");
		ta = new TextArea(10,30); 		// 10 rows and 30 columns
		tf = new TextField(20);
		b = new Button("Click");
		Handler h = new Handler();
		
		setLayout(new FlowLayout());
		add(ta);
		add(l);
		add(tf);
		add(b);
		b.addActionListener(h);
	}
	
	class Handler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
//			l.setText(ta.getSelectedText());		// will give you the selected Text
//			when I write a text -> select a part of text -> click the button -> the Label will be changed
			
//			ta.append(tf.getText());
//			for Modifying the ta from tf
			
			ta.insert(tf.getText(), tf.getCaretPosition());
//			this method will allow to insert the text at any position when  want to by using the cursor.
			
		}
		
	}
}
public class AWT_08_TextArea_and_Operations 
{
	public static void main(String[] args) throws Exception
	{
		myFrame8 mf = new myFrame8();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}

