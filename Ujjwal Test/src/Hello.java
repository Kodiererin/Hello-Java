//	Lambda Expression
//	1. Create an Interface.
//	2. Define a Method in the Interface
//	3. Call the Interface in the Main Method inorder to create an Interface

//	Inorder to create a Lambda function you have to create an interface.
//	In One interface you have to create only one function iorder to implement Lambda Function or else the function will throw a 
//	compile time error.-

interface ananya{
	public int calculate(int x , int y);
}

interface ananya2{
	public void calculateSum(int x , int y , int z);
}
public class Hello {
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		Creating a lambda function
//		This lambda function will return an integer...
		ananya myFunction = (int x , int y) ->{
			return x+y;
		};
		System.out.println(myFunction.calculate(2, 4));
		
		ananya2 haiNaAnanya = (int x , int y , int z) ->{
			System.out.println("The Result is "+(x+y+z));
		};
		
		haiNaAnanya.calculateSum(999, 999, 999);
	}
}
