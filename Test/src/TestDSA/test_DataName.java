//Check The SOrting algorithm

package TestDSA;
public class test_DataName 
{
	static class Node
	{
		int roll;
		String Name;
		Node next;
		Node(int roll , String Name)
		{
			this.Name = Name;
			this.roll = roll;
		}
	}
	static Node head =  null;
	static int count=0;
	public static void create(int roll , String Name)
	{
		head = new Node(roll , Name);
		count++;
	}
	public void insertBeg(int roll , String Name)
	{
		if(head==null)
		{
			create(roll,Name);
		}
		else
		{
			Node p = new Node(roll,Name);
			p.next = head;
			head = p;
			count++;
		}
	}
	public void display()
	{
		System.out.println("The Total Strength of the Class"+count);
		Node p = head;
		while(p!=null)
		{
			System.out.println("Roll No "+p.roll+" Student Name "+p.Name);
			p = p.next;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Data Entry System");
		test_DataName obj = new test_DataName();
		System.out.println("Press 1 for Enter More Data ");
		@SuppressWarnings("resource")
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		while(x==1)
		{
			System.out.println("Enter The Roll No and First Name of the Student");
			obj.insertBeg(sc.nextInt(), sc.next());
			System.out.println("Press 1 for Enter More Data ");
			x = sc.nextInt();
		}
		obj.display();
	}
}
