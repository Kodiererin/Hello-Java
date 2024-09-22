package Practise_Experiments;

import java.util.Scanner;

public class practise_Exam_ArrayQueue 
{

	static int MAXSIZE = 5;
	static int front = -1;
	static int rear = -1;
	static int [] Queue = new int[MAXSIZE];
	static Scanner sc = new Scanner(System.in);
	public static void push()
	{
		if(rear== -1)
		{
			front = front+1;
			rear = rear+1;
		}
		else if(front == 0)
		{
			rear = rear+1;
		}
		if(rear >= MAXSIZE)
		{
			System.out.println("Overflow");
		}
		else
		{
			System.out.println("Enter Data");
//			int data = sc.nextInt();
			Queue[rear] = sc.nextInt(); 
		}
	}
	public static void pop()
	{
		System.out.println("The Deleted Element is "+Queue[front]);
		front = front+1;
		if(front==MAXSIZE)
		{
			System.out.println("Underflow");
		}
	}
	public static void display()
	{
		int i = front;
		while(i!=rear)
		{
			System.out.println(Queue[i]);
			i++;
		}
	}
	public static void main(String[] args) 
	{
		push();
		push();
		push();
		push();
		push();
		push();
		push();
		display();
		pop();
		pop();
		pop();
		display();
		pop();
		display();
		
	}
}
