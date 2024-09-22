import java.util.*;
class UjjwalCompany
{
	int Employeeid;
	String EmployeeName;
	int Roomno;
	
	public void getdata(int eid,String Ename , int room)
	{
		Employeeid = eid;
		EmployeeName = Ename;
		Roomno = room;
	}
	public void	motabhai()
	{
		System.out.println("Welcome TO Ujjwal Company");
		System.out.println("The Employee ID "+Employeeid);
		System.out.println("The Employee Name is "+EmployeeName);
		System.out.println("The Room No of the Employee Name "+Roomno);
	}
}
class Kemcho
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		UjjwalCompany Kemcho = new UjjwalCompany();
		System.out.println("Enter The Employee Id , Employee Name , Employee Room No");
		int x = sc.nextInt();
		String y = sc.next();
		int room = sc.nextInt();
		Kemcho.getdata(x,y,room);
		Kemcho.motabhai();
		
	}
}