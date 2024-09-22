package Test01;
import java.awt.*;
import java.applet.*;
import java.applet.*;
/*
< applet code = "abc" width = 750 height = 750>
<param name = "param1" value = "SAI">
</applet>
*/
public class abc extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.red);
	}
	public void start()
	{
		msg = getParameter("param1");
	}
	public void paint(Graphics g1)
	{
		g1.drawString(msg, 50, 30);
	}
	
}