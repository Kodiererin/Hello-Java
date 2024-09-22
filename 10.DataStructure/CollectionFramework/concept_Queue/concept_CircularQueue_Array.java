package concept_Queue;

public class concept_CircularQueue_Array
{
	static int front =-1;
	static int rear = -1;
	static int size  = 5;
	static int[] queue = new int[size];
	public static void insert(int x)
	{
//		if(rear==(size-1) || front==(rear+1) )			First code
//		{
//			System.out.println("Overflow");
//		}
		if(front==(rear+1)%size)					//	Second code
		{
			System.out.println("Overflow");
		}
		else
		{
//			Scanner sc = new Scanner(System.in);
			if(rear==-1)
			{
//				if the conditon is passed then the Circular Queue is Empty
				front=0;
				rear =0;
			}
//			if((rear==size-1) && (front!=0)	)
//			{
//				rear=0;
//			}
//			else
//			{
//				rear = rear+1;
//			}
			else
			{
				if(rear==-1)
				{
					front=0;
					rear=0;
				}
				else
				{
					rear = (rear+1)%size;
				}
			}
//			System.out.println("Enter The Data");
//			int data = sc.nextInt();
			int data = x;
			queue[rear] = data;
		}
	}
	public static void delete()
	{
		if(front==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("Deleted element = "+queue[front]);
			if(front==rear)
			{
				front =-1;
				rear = -1;
			}
			else
			{
				front = (front+1)%size;
			}
		}
	}
	public static void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty. Underflow");
		}
		else
		{
			if(front<rear)
			{
				int x = front;
				while(x!=rear)
				{
					System.out.println(queue[x]);
					x++;
				}
			}
			else
			{
				int x =  front;
				while(x!=rear)
				{
					if(x==size)
					{
						x = 0;
					}
					System.out.println(queue[x]	);
					x++;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		insert(10);
		insert(10);
		insert(10);
		insert(10);
		insert(10);
		insert(90);
		display();
		delete();
		delete();
		display();
		System.out.println("------------");
		insert(20);
		insert(60);
//		display();
		display();
	}
}
