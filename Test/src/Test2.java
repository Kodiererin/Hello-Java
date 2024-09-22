//ASCII - AMERICAN STANDARD VALUE OF INFORMATION INTERCHANGE
//I am going to collect user input and display the ASCII value from the user.

import java.util.*;
public class Test2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character you want to get the ASCII value");
		char x = sc.next().charAt(0);
		int y = x;
		System.out.println("ASCII value is = "+y);
		
	}

}
