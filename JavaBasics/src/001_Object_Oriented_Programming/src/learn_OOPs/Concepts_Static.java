package learn_OOPs;
import java.util.*;
class Test2
{
	static void show() // we are implementing static function to check its use
	{					// static function memory me save ho jata h taki space km lge
		System.out.println("Welcome to the company Ujjwal");
	}
}
public class Concepts_Static 
{
	public static void main(String[] args)
	{
		Test2.show(); // show function got initiated without creating object
	}
}
