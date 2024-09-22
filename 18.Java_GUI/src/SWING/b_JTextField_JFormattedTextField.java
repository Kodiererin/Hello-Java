package SWING;
import java.text.*;
import java.util.Date;
import java.util.Locale;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.text.NumberFormatter;

//	Formatted Text Field -> Important
class myFramee extends JFrame
{
//	private static final Locale Locale = null;
	JTextField tf1;
	JFormattedTextField tf2;			// we can make for date, currency, format
	JFormattedTextField tf3;
	JFormattedTextField tf4;
	JTextArea ta;
	DateFormat df;
	myFramee()
	{
//		super("JTextField");
		tf1 = new JTextField(15);					// 15 is the no of columns
		
		df = new SimpleDateFormat("dd/MMMM/yyyy");
		tf2 = new JFormattedTextField(df);
		tf2.setColumns(15);
		tf2.setValue(0);					// java counts date from 1st Jan 1970
		tf2.setValue(new Date());			// for Todays Date
		
		
//		RESTRICTING TEXT FIELD FOR A PARTICULAR FORMAT(NUMBER,CURRENCY)...
		
//		one more text For number format
		
//		for setting Number format-------------------------
		NumberFormat nf = NumberFormat.getInstance();
		NumberFormatter nft = new NumberFormatter(nf);

//		to limit it to numbers
		nft.setAllowsInvalid(false);
		
//		to set Limited Numbers 
		nft.setMaximum(10000);
		tf3 = new JFormattedTextField(nft);
		tf3.setColumns(15);
//		-----------------------------------------------------
		
//		Currency Formatter----------------------------------------
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter nft2 = new NumberFormatter(nf2);
		
		nft2.setAllowsInvalid(false);
		tf4 = new JFormattedTextField(nft2);
		tf4.setColumns(15);
		tf4.setValue(0);
//		-----------------------------------------------------------
		
//		ta = new JTextArea(15,30);		
//		We can add The text area also
		
		setLayout(new FlowLayout());
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
	}
}
public class b_JTextField_JFormattedTextField 
{
	public static void main(String[] args) 
	{
		myFramee obj = new myFramee();
		obj.setSize(400,400);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
