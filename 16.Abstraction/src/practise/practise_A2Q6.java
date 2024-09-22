//	Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a 
//	java program to display area of different shapes. 
package practise;

import java.util.Scanner;

abstract class Shape
{
	abstract void area();
}
class Square extends Shape
{
	int x;
	Square(int x)
	{
		this.x = x;
	}
	@Override
	void area() 
	{
		// TODO Auto-generated method stub
		System.out.println("The Area of Square is "+(x*x));
	}
	
}
class Triangle extends Shape
{
	int a;
	int b;
	int c;
	Triangle(int a , int b , int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	void area() 
	{
		int s = (a+b+c)/2;
		System.out.println("The Area of Triangle is "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
	}
	
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r = r;
	}
	@Override
	void area() 
	{
		// TODO Auto-generated method stub
		System.out.println("The Area of the circle is "+(4/3*Math.PI*r*r));
	}
	
}
public class practise_A2Q6 
{
	public static void main(String[] args) 
	{
		System.out.println("Abstract Class Implementation from the Assignment Question");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The side of the triangle ");
		Shape t = new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
			t.area();
		System.out.println("Enter The Radius of the circle");
		Shape c = new Circle(sc.nextInt());
			c.area();
		System.out.println("Enter The Side of the Square");
		Shape s = new Square(sc.nextInt());
			s.area();
		sc.close();		
	}
}
