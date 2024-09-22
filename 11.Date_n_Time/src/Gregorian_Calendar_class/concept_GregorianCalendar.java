package Gregorian_Calendar_class;

import java.util.Calendar;
import java.util.GregorianCalendar;

class info_Gregorian
{
	info_Gregorian()
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@ GregorialCalendar class is the concrete sub-class of Calendar class.");
		System.out.println("@ This class Supports both Julian and Gregorian Calendar System.");
		System.out.println("Difference Between Gregorian Calendar and Calendar is ");
		System.out.println("Calendar ~ \"Calendar c = Calendar.getInstance();\" ");
		System.out.println("GregorianCalendar ~ \"GregorianCalendar c = new GregorianCalendar.getInstance();\" ");
		System.out.println("Yaad Rakhna Ki GregorianCalendar me new Keyword use hoga call krne ke liye!");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	}
	public void constructors_GregorianCalendar()
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		 System.out.println("Constructors of The Gregorian Calendar CLass ");
		 System.out.println("#1. GregorianCalendar() ~ This constructor is used to initialize an object with the current time in the default time zone.");
		 System.out.println("#2. GregorianCalendar(int year , int month , int day) ~ This constructor is used to initialize an object with date set specified as parameter in the default time zone and default locale");
		 System.out.println("#3. GregorianCalendar(int year , int month , int day , int hours , int minutes ) : This constructor initializes an object with the given date and time set in the default locale and time zone");
		 System.out.println("#4. GregorianCalendar(int year, int month, int day, int hours, int minutes, int seconds): This constructor initializes an object with the more specific time and date-set passed as a parameter in the default locale and time zone.");
		 System.out.println("#5. GregorianCalendar(Locale locale): Initializes a GregorianCalendar object with the current date and time in the default time zone and the specified locale.");
		 System.out.println("#6. GregorianCalendar(TimeZone timeZone): Initializes a GregorianCalendar object with the current date and time in the default locale and the specified time zone.");
		 System.out.println("#7. GregorianCalendar(TimeZone timeZone, Locale locale): Initializes an object with the locale and timezone passed as parameters.");
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	}
	public void implementing_Methods()
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		GregorianCalendar gre = new GregorianCalendar();
		
		System.out.println("isLeapYear Method");
		System.out.println("Is this Year a Leap Year "+gre.isLeapYear(gre.YEAR));
		System.out.println("Is 2001 a leap year "+gre.isLeapYear(2001));
		
		System.out.println("\n roll(int field, boolean up) ~ This Method adds/substracts a single unit of time from thespecified time field.");
		System.out.println(" true = rolls up the value by 1");
		System.out.println(" false = rolls down the value by 1");
		System.out.println("Date before rolling : "+gre.getTime());
				gre.roll(Calendar.MONTH, true);
				gre.roll(Calendar.DATE, false);
				gre.roll(Calendar.YEAR, true);
		System.out.println("Date After Rolling : "+gre.getTime());
		
		System.out.println("\nhashCode() ~ This Method returns the hashcode of the calendar object.");
		System.out.println("Calendar : "+gre.getTime());
		System.out.println("The hashcode for this calendar is "+gre.hashCode());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	}
}
public class concept_GregorianCalendar 
{
	public static void main(String[] args) 
	{
		info_Gregorian info = new info_Gregorian();
		info.constructors_GregorianCalendar();
		info.implementing_Methods();
	}
}
