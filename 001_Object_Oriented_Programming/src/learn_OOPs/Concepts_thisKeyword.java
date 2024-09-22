package learn_OOPs;
class ujjwalRectangle
{
	double width ;  //attributes 
	double height;	// attributes
	ujjwalRectangle(double w , double h) 
	{
		this.height = h;
		this.width = w;
	}
	ujjwalRectangle()
	{
		System.out.println("Rectangle with no parameter has been activated");
		this.width = 25;
		this.height = 25;
	}
	ujjwalRectangle(double war)
	{
		this.width = war;
		this.height = war;
	}
	double area()
	{
		return this.width*this.height;
	}
}
public class Concepts_thisKeyword 
{
	public static void main(String[] args)
	{
		ujjwalRectangle ur1 = new ujjwalRectangle(5,10);
//		ur1.area();
		System.out.println(ur1.area()+" is The area ");
		
	}
}
