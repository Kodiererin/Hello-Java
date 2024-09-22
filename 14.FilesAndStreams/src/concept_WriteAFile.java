import java.io.*;
import java.util.Scanner;
class Create_File
{
	public void create()
	{
		File myFile = new File("C:\\Users\\ujjwa\\Desktop\\JavaTempFille\\Ujjwal.txt");
		try
		{
			myFile.createNewFile();
			System.out.println("New File Created Successfully");
		}
		catch(Exception e)
		{
			System.out.println("An error occured. Please Try AGain");
		}
	}
}
class writeMyFile extends Create_File
{
	public void write()
	{
		System.out.println("FileWriter class is used with write() method to write some content.");
		System.out.println("Dont forget to use close() method when you are finished to writing a file.");
		
		try
		{
			FileWriter writemyFile = new FileWriter("Ujjwal.txt");
			writemyFile.write("Kaisab Baa Ujjwal bhaiya Ji, Sb theek Baani ki Nahi");
			writemyFile.close();
		}
		catch(Exception e)
		{
			System.out.println("An Exception/Error occured please try again later");
		}
	}
}
class readmy_File extends Create_File
{
	
	public void readby_Scanner()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("An Exception occured ");
		}
	}
}
class deleteFile
{
	File myFile = new File("Ujjwal.txt");
	public void delete()
	{
		if(myFile.delete())
		{
			System.out.println("I Have deleted the file"+myFile.getName());
		}
		else
		{
			System.out.println("Some Problem Occured");
		}
	}
}
public class concept_WriteAFile
{
	public static void main(String[] args) throws Exception
	{
		Create_File cf = new Create_File();
			cf.create();
		writeMyFile wmy = new writeMyFile();
			wmy.write();
		readmy_File rmf = new readmy_File();
			rmf.readby_Scanner();
	}
}