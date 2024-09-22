package concept_CirculerQueue;

public class concept_Queue_Array
{
	static int front = -1;
	static int rear = -1;
	static int[] arr = new int[5];
	public static void insert(int data)
	{
		if(front==-1)
		{
			front=front+1;
			rear = rear+1;
		}
		if(front>-1)
		{
			if(front==0)
			{
				rear = rear+1;
			}
			if(front>0)
			{
				rear = front-1;
			}
			if(rear==front)
			{
				System.out.println("Overflow");
			}
		}
		arr[rear] = data;
	}
	public static void pop()
	{
		if(front==-1)
		{
			System.out.println("Underflow");
		}
		else if(front>rear)
		{
			System.out.println("Underflow");
		}
		else if(front==arr.length-1)
		{
			front = 0;
		}
		else
		{
			front = front+1;
		}
	}
	public static void display()
	{
		int i=0;
		while(i!=arr.length-1)
		{
			System.out.println(arr[i]);
			i= i+1;
		}
	}
	public static void main(String[] args)
	{
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		display();
		pop();
		pop();
		display();
	}
}
