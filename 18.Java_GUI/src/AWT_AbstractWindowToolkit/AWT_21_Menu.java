package AWT_AbstractWindowToolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
class myFrame24 extends Frame
{
	Menu file,sub;
	
	MenuItem open,save,close,closeAll;
	CheckboxMenuItem auto;
	
	TextField tf;
	
	myFrame24()
	{
		super("MENU");
		open = new MenuItem("Open");
		save = new MenuItem("save");
		close = new MenuItem("close");
		closeAll = new MenuItem("closeAll");
		
		auto = new CheckboxMenuItem("Auto Save");
		
		file = new Menu("File");
		sub  = new Menu("Close");
		
		file.add(open);
		file.add(save);
		file.add(sub);
		file.add(auto);
		
		sub.add(close);
		sub.add(closeAll);
		
		MenuBar mb = new MenuBar();
		mb.add(file);
		setMenuBar(mb);				// method of frame class to set Menu Bar
		
		tf = new TextField("           ");
//		tf.setSize(100, 100);
		setLayout(new FlowLayout());
		add(tf);
		
		open.addActionListener((ActionEvent e)->tf.setText("Open"));
		close.addActionListener((ActionEvent e)->tf.setText("close"));
		save.addActionListener((ActionEvent e)->tf.setText("save"));
		closeAll.addActionListener((ActionEvent e)->tf.setText("closeAll"));
		
		auto.addItemListener((ItemEvent ie)->
		{
			if(auto.getState())
			{
				tf.setText("Auto On");
			}
			else
			{
				tf.setText("Auto off");
			}
		});
	}
}
public class AWT_21_Menu 
{
	public static void main(String[] args) 
	{
		myFrame24 mf = new myFrame24();
		mf.setSize(400,400);
		mf.setVisible(true);
	}
}
