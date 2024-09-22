package NewTopics;
import java.util.*;
class student1
{
		String name;
		int roll;
		int mark;
		void setData(String name,int roll,int mark)
		{
			this.name = name;
			this.roll = roll;
			this.mark = mark;
		}
		void display()
		{
			System.out.println("The Student Name is "+this.name);
			System.out.println("The Student Roll is "+this.roll);
			System.out.println("The Student Mark is "+this.mark);
		}
	}
	 public class ArrayOfObjects_Code  
	{
		public static void main(String[] args) 
		{
			System.out.println("Hello Ujjwal");
			Scanner sc = new Scanner(System.in);
			student1 obj[] = new student1[3];
//			student1[] obj;
//			obj = new student1[3];
			System.out.println("Enter The Student Name,Roll,Marks in order wise");
			for(int i=0 ; i<obj.length ; i++)
			{
				obj[i] = new student1();
				obj[i].setData(sc.next() , sc.nextInt(), sc.nextInt());
			}
			sc.close();
			for(int j=0 ; j<obj.length ; j++)
			{
				obj[j].display();
			}	
		}
	}