package b_concept_Stack;
//	Stack is a Linear DataStructure.
//	Insertion Operation is called Push.
//	DLL_03_Deletion Operation is called pop.
//	isEmpty : boolean value : check if the Stack is empty or not.
//	peek() : returns the top value.
//	size() : returns the size of the Stack


public class concept_Stack_Array
{
	static int front = -1;
	static int maxSize = 5;
	static int [] arr = new int[maxSize];
	public static void push(int data)
	{
		front++;
		if(front>=maxSize)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			System.out.println("Enter Data");
			arr[front] = data;
		}
	}
	public static void pop()
	{
		System.out.println("The Element "+arr[front]+" has been popped out. ");
		front--;
		if(front==-1)
		{
			System.out.println("Stack Underflow");
		}
//		else
//		{
//			System.out.println("The Element "+arr[front]+" has been popped out. ");
//		}
	}
	public static void display()
	{
		for(int i=0 ; i<=front ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		display();
		pop();
		pop();
		display();
		System.out.println("Insert = 99");
		push(99);
		display();
	}
}
