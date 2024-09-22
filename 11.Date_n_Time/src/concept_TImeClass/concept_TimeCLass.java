package concept_TImeClass;
import java.util.*;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalTime;
import java.time.*;
class infoTime
{
	infoTime()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("----->java.time API - Class & Methods<-----");
		System.out.println("Date and Time Featurs in JAVA is primarily supported by two  Packages :");
		System.out.println("      @ java.util");
		System.out.println("      @ java.time");
		System.out.println("The package java.time was added with the release of java 8 with the aim of solving problems "
							+ "\nfaced by the java developers while handling date and time with java.util package such as representing a date without time");
		System.out.println("Below some widely/common used classes have been discussed... so all the best!......\n");
		System.out.println(".................................................................................................................................................\n");
	}
}
class Java_time extends Thread
{
	public void clockClass() 
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("1. Clock class ");
		System.out.println("This class provides access to the current instant, date and time zone using a time-zone.\r\n"
				+ "Clock class is an abstract class therefore it is not possible to create instance of the clock class.\r\n"
				+ "Some methods of the clock class :\r\n"
				+ "abstract ZoneId getZone() : This methods returns the time zone being used to create date and time objects.\n");
		
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(""+c1.getZone());
		System.out.println(".................................................................................................................................................\n");
	}
	public void abstract_Instant_instant_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("This methods returns the current instant of the clocks.");
		Clock c1 = Clock.systemUTC();
		System.out.println(c1.instant());
		System.out.println(".................................................................................................................................................\n");
	}
	public void duration_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("This class is used to measure time in seconds and nano seconds.\r\n"
				+ "This class is immutable.\r\n"
				+ "Some Methods of the duration class :\r\n"
				+ "boolean isNegative() : This method is used to check if the duration is negative.");
		Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON); //LocalTime.MIN = '00:00' , LocalTIme.NOON = '12:00'
			System.out.println(d1.isNegative());
		Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN); //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
			System.out.println(d2.isNegative());
			System.out.println(".................................................................................................................................................\n");
	}	
	public void is_Zero_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("isZero() : This method is used to check if the duration is zero. Returns boolean");
		 Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
	        System.out.println(d1.isZero());

	        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

	        System.out.println(d2.isZero());
	        System.out.println(".................................................................................................................................................\n");
	}
}
class LocalDateClass extends Thread
{
	public void LocalDate_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("LocalDate class :\r\n"
				+ "This class is useful for representing the dates in the year-month-day format.\r\n"
				+ "With the help of LocalDate class, dates can be represented without time.");
		 LocalDate d = LocalDate.now();
         System.out.println(d);
         System.out.println(".................................................................................................................................................\n");
	}
	public void compareTo_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("compareTo() : This method compares the equality of the two dates. Returns boolean value.");
		LocalDate d = LocalDate.parse("2021-05-27");
        LocalDate d1= LocalDate.parse("2021-05-26");
        LocalDate d2= LocalDate.parse("2021-05-26");

        System.out.println(d1.equals(d));
        System.out.println(d2.equals(d1));
        System.out.println(".................................................................................................................................................\n");
	}
	public void withYear_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.");
		LocalDate d = LocalDate.parse("2021-05-27");
        System.out.println(d.withYear(2001));
        System.out.println(".................................................................................................................................................\n");
	}
}
class LocalTime_class
{
	public void localTime_mehod()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("LocalTime class :\r\n"
				+ "This class helps us to represent the time without the dates.\r\n"
				+ "Instances of LocalTime class are mutable");
            LocalTime t = LocalTime.now();
            System.out.println(t);
       System.out.println(".................................................................................................................................................\n");
	}
	public void localTime_plusHours_method()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("LocalTime plusHours(long hoursToAdd) : This method returns a copy of the LocalTime but with the specified number of hours added.");
		LocalTime t = LocalTime.of(13,18,29);
        System.out.println("Time before : "  + t);

        LocalTime t1= t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);
        System.out.println(".................................................................................................................................................\n");
	}
	public void LocalTime_minus_Minutes()
	{
		System.out.println(".................................................................................................................................................\n");
		System.out.println("LocalTime minusMinutes(long minutesToSubtract) : This method returns a copy of the LocalTime but with the specified number of minutes subtracted.");
		LocalTime t = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + t);

        LocalTime t1= t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t1);
        System.out.println(".................................................................................................................................................\n");
	}
}
public class concept_TimeCLass
{
	public static void main(String[] args) 
	{
		infoTime info = new infoTime();
		Java_time jt = new Java_time();
			jt.clockClass();
			jt.abstract_Instant_instant_method();
			jt.duration_method();
			jt.is_Zero_method();
		LocalDateClass ldc = new LocalDateClass();
			ldc.LocalDate_method();
			ldc.compareTo_method();
			ldc.withYear_method();
		LocalTime_class ltc = new LocalTime_class();
			ltc.localTime_mehod();
			ltc.localTime_plusHours_method();
			ltc.LocalTime_minus_Minutes();
		
		
	}
}
