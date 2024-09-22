package Questions;
import java.util.Calendar;

class Question
{
	Question()
	{
		System.out.println(" Use the Calendar class in Java to print the time in the following format : 21:47:02.");
	}
}
public class cwh_Question2 extends Thread 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		System.out.println("12 Hour Format");
			System.out.println(c.get(c.HOUR)+" : "+c.get(c.MINUTE)+" : "+c.get(c.SECOND));
		System.out.println("24 Hour Format ");
			System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));
	}
}
