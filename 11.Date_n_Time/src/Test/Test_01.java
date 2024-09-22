package Test;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class storeArray
{
	public String[] storeArrayTime(String...is)
	{
		String [] arr = new String[5];
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyy");
		for(int i=0 ; i<5 ; i++)
		{
			arr[i]  = df.format(ldt)+"";
			System.out.println("The Date is "+arr[i]);
		}
		return is;
	}
}
public class Test_01 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please Write your name ");
			String name = br.readLine();
		storeArray sa = new storeArray();
		sa.storeArrayTime(name);
	}
}
