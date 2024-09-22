package SWING;
//	JTree Component Help us to represent the Data in Tree Structure.

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.io.File;


class myFrame5 extends JFrame
{
	JTree tree;
	JLabel label;
	myFrame5()
	{
		super("JTree Demo");
		
//		TreeNode is an interface Which we cannot use it directly
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\MyJava");
		File f = new File("C:\\MyJava");				// See Java IO section
//	If I want to add it to root then I have to use Loop If I have Many
		for(File x:f.listFiles())			// list file is a array of files
		{
			if(x.isDirectory())
			{
				DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
				for(File y:x.listFiles())
				{
					temp.add(new DefaultMutableTreeNode(y.getName()));
				}
				root.add(temp);
			}
			else
				root.add(new DefaultMutableTreeNode(x.getName()));
		}
//		This root was used to add Files ie Nodes
		
		tree = new JTree(root);
		label = new JLabel("No Files Selected");
//		to add scroll bar
//		Just add any component to the ScrollPane and then the Scroll Bar will be added automatically.
		
		tree.addTreeSelectionListener(new Handler());
		JScrollPane sp = new JScrollPane(tree);
		
		
//		Default layout is the BorderLayout
		add(sp,BorderLayout.CENTER);
		add(label, BorderLayout.SOUTH);
	}
	
	class Handler implements TreeSelectionListener
	{

		@Override
		public void valueChanged(TreeSelectionEvent e) 
		{
			// TODO Auto-generated method stub
			label.setText(e.getPath().toString());
		}
		
	}
}
public class e_JTree 
{
	public static void main(String[] args) 
	{
		myFrame5 mf = new myFrame5();
		mf.setSize(400,400);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
