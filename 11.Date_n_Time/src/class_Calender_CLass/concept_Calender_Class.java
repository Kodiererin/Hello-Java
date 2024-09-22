package class_Calender_CLass;
import java.util.*;
//import java.util.Calendar;

class calendarInfo
{
	calendarInfo()
	{
		System.out.println("1. The Calender class in Java provides the Methods that helps in converting date between a specific instant in time.");
		System.out.println("2. It is  an abstract class");
		System.out.println("3. Since it is an abstract class m we can not create an instant of this class with the help of a constructor.");
		System.out.println("4. We use the static method Calenger,getInstance() in order to implement a subclass");
	}
	public void calenderMethods()
	{
		System.out.println("1. Calender() ~ This constructor is used to cinstruct a calender with the default time zone and locale");
		System.out.println("2. Calender(Time Zone , Locale locale )  This constructor is used to construct a calender with the specified time zone & locale");
	}
}
class calendarBasicMethod
{
	calendarBasicMethod()
	{
		System.out.println("Here you will see the most used methods of the calender class ");
	}
	public void calenderMethod1()
	{
		Calendar c = Calendar.getInstance();
		System.out.println("Current Year = "+c.get(Calendar.YEAR));
		System.out.println("Current Month = "+c.get(Calendar.MONTH));
		System.out.println("Current Day = "+c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current Hour = "+c.get(Calendar.HOUR));
		System.out.println("Current Minute = "+c.get(Calendar.MINUTE));
		System.out.println("Current Second = "+c.get(Calendar.SECOND));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public void calenderMethod2()
	{
		System.out.println("This Is Method #2");
		System.out.println("add(int field , int amount) ~ This method is useful for calculating the time after or before of a specific calender field.\n");
		Calendar c2 = Calendar.getInstance();
		System.out.println("Current Date is "+c2.getTime());
		
		c2.add(Calendar.YEAR, 4);
			System.out.println("Date After 4 years "+c2.getTime());
		
		c2.add(Calendar.YEAR, -12);
			System.out.println("Before 12 Years "+c2.getTime());
		
		c2.add(Calendar.MONTH, 2);
			System.out.println("After 2 Months "+c2.getTime());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public void calenderMethod3()
	{
		System.out.println("getWeeksInWeekYear() ~ This Method returns the number of weeks");
		Calendar c3 = Calendar.getInstance();
		System.out.println("Number of weeks in a year is "+c3.getWeeksInWeekYear());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public void calenderMethod4()
	{
		System.out.println("getMaximum(int field) ~ Retuurns the maximum value for specified calendar field.");
		Calendar c4 = Calendar.getInstance();
		System.out.println("The Maximum number of weeks in a year "+c4.getMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

public class concept_Calender_Class 
{
	
	public static void main(String[] args) 
	{
		calendarInfo cInfo = new calendarInfo();
					cInfo.calenderMethods();
		System.out.println("----------------------------");
		calendarBasicMethod method = new calendarBasicMethod();
			method.calenderMethod1();
			method.calenderMethod2();
			method.calenderMethod3();
			method.calenderMethod4();
	}

}
