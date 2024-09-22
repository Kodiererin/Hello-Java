//Samjho Buffered Reader ka concept ar use kro!
import java.io.*;
public class Concept_BufferedReader 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the Data from the Keyboard");
		String Input = br.readLine(); // yha pe IO exception throw kr dega isliye hm IO exception use krenge
		System.out.println(Input);
	}
}
