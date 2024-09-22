package a_1_Linked_List;
import java.util.Scanner;
public class b_LL01_Implementation02
{
		static Node head;
		static void createList()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Data in the Node ");
			int x = sc.nextInt();
			Node temp = new Node(x);
			if(head == null)
			{
				head = temp;
			}
			{
				System.out.println("Do You want to Continue ");
				Node p = head;
				int choice = sc.nextInt();
				if(choice>0)
				{
					while(choice>0)
					{
						temp = new Node(sc.nextInt());
						p.next = temp;
						p = p.next;
						choice = sc.nextInt();
					}
				}
			}
		}
		static void display()
		{
			Node p = head;
			while(p!=null)
			{
				System.out.print(p.Data+" -----> ");
				p = p.next;
			}
			System.out.println("null");
		}
		public static void main(String[] args)
		{
			System.out.println("My Linked List");
			createList();
			display();
		}
	}