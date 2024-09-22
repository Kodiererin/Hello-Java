package learn_OOPs_Passsing_n_ReturningObjects;
class Box
{
	double width;
	double height;
	double depth;
//	this constructor takes n object!.....
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
//	constructors when all dimensions specified
	Box(double w, double h , double d )
	{
		width = w;
		height = h;
		depth = d;
	}
	double volume()
	{
		return width*height*depth;
	}
}
public class concept_constructor_takes_Object_of_itsclass 
{
	public static void main(String[] args) 
	{
//		creating an object
		Box myBoxObj = new Box(10,20,15);
//		creating a copy of myBoxObj
		Box cloneObj = new Box(myBoxObj);
		
		double vol;
		
//		getting the volume of myBox
		vol = myBoxObj.volume();
		System.out.println("Volume of my Box = "+vol);
		
//		get volume of cloneObj
		vol = cloneObj.volume();
		System.out.println("Volume of cloneObj is "+vol);
	}
}
