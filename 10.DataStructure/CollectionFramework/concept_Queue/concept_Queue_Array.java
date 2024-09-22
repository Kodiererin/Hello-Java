package concept_Queue;

import java.util.Scanner;

public class concept_Queue_Array
{
	static int front = -1;
	static int rear = -1;
	public static int[] push(int[] arr , int element)
	{
		rear = rear+1;
		if(rear==-1)
		{
			front = front+1;
		}
		if(rear>=arr.length)
		{
			System.out.println("Element Cannot Be inserted");
			rear = rear-1;
		}
		if(rear<=arr.length-1)
		{
//			rear = rear+1;
//			System.out.println("Inserting "+element);
			arr[rear] = element;
		}
		return arr;
	}
	public static void pop(int[] arr)
	{
		front = front+1;
		arr[front]=0;
	}
	public static void display(int[] arr)
	{
		for (int element : arr) {
			System.out.println(element);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array Queue");
		int[] arr = new int[sc.nextInt()];
		arr = push(arr,1);
		arr = push(arr,1);
		arr = push(arr,1);
		pop(arr);
		pop(arr);
		display(arr);
		arr = push(arr,98);
//		display(arr);
	}
}
