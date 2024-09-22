package Questions;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Question3
{
	Question3()
	{
		System.out.println(" Use the Calendar class in Java to print the time in the following format : 21:47:02.");
	}
}
public class cwh_Question3 extends Thread
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyy");
		String myDate = ldt.format(df);
		System.out.println("The Date is "+myDate);
				
	}
}
