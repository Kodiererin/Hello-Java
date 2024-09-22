import java.io.File;
import java.io.IOException;
public class concept_CreateFile 
{
	public static void main(String[] args) 
	{
		System.out.println("Creating a new File");
		System.out.println("createNewFile() ~ MEthod is Used to create a new file");
		
		File ujjwalFile = new File("Ujjwal_File.txt");
		try {
			ujjwalFile.createNewFile();
			System.out.println("THe new File has been created Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
