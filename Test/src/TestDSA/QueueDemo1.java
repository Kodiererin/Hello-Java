package TestDSA;
import java.util.*;
public class QueueDemo1 { 
 
 
public static void insert(int Q[]) 
 { 
	Scanner sc = new Scanner(System.in);
	ArrayDeque <Integer> obj = new ArrayDeque<>();
	System.out.println("Enter The Data in the Queue");
	for(int i=0 ; i<Q.length ; i++)
	{
		obj.add(sc.nextInt());
	}
 } 
 public static void delete(int Q[])
 {
	 
 }
 
/* Write the code for remaining user defined methods*/
 
 
public static final int MAX=5; 
public static int front=-1; 
public static int rear=-1; 
 
public static void main(String[] args) 
{ 
 
 Scanner sc=new Scanner(System.in); 
 int queue[]=new int[MAX]; 
 
 while(true) 
 { 
	 
	 System.out.println("***MENU***"); 
	 System.out.println("0: Exit"); 
	 System.out.println("1: Insert"); 
	 System.out.println("2: Delete"); 
	 System.out.println("3: Display"); 
	 System.out.println("Enter your choice"); 
	 int choice=sc.nextInt(); 
	 switch(choice) 
 { 
 	case 0: 
 		System.exit(0); 
 	case 1: 
 		insert(queue); 
 		break; 
 
 ----- 
 -----
 
 default: 
 System.out.println("Invalid choice"); 
 } 
 } 
 } 
}