package Concept_Basic;
class info_time
{
	info_time()
	{
		System.out.println("1. Java.time - This is the Package for Date n Time in Java which was introduced in JAVA JDK 8 \nearlier date n time was in Java.uti. package which has been discontinued.");
		System.out.println("2. Date n Time is stored in long datatype. ");
		System.out.println("3. Java assumes that 1900 is the start year and it calculates the initial year from 1900");
		System.out.println("4. But, Java calculates Milliseconds from 1 Jan 1970");
	}
	public void info_time_Methods()
	{
		System.out.println("1. System.currentTimeMillis() - This method returns the time from 1 Jan 1970 to the present time in milliseconds.");
	}
}
public class Time_Since_1970_1 
{
	public static void main(String[] args) 
	{
		System.out.println("The Time from 1 Jan 1970 till 4-4-2020 @00:19 is "+System.currentTimeMillis());
//			The Time from 1 Jan 1970 till 4-4-2020 @00:18 is 1649011764340
		System.out.println("The Years From 1 Jan 1970 till today is "+System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println("The Hours From 1 Jan 1970 till today is "+System.currentTimeMillis()/1000/60/60/24);
		System.out.println("The Days From 1 Jan 1970 till today is "+System.currentTimeMillis()/1000/60/60);
		System.out.println("The Minutes From 1 Jan 1970 till today is "+System.currentTimeMillis()/1000/60/60);
		
	}
}
