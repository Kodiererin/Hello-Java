package Calculator;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
			int y = x/10;
			int z = y%10;
		System.out.println(y);
		System.out.println(z);
	}

}
