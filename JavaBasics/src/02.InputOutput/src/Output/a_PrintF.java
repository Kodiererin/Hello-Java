/*	This package include the output formatting and the use ability of PRINTF statement.
 * 	This statement has been imported from C++ so the concept came from there.
 * 	printf ~ is a best output formatting method which could make your output more easy and reliable.
 * 
 *  // ~> represents the output of the following statement.
 */
package Output;
import java.util.Calendar;
public class a_PrintF 
{ // although I have divided the code to different catagories but check the code once as many have multiple
//	catagory uses
	public static void main(String[] args)
	{
//----------------Characters-&-Strings--------------------------------------------
		System.out.printf("%S", "Ujjwal"); // UJJWAL 
			System.out.println();	// ~ Uppercase kr deta a
		System.out.printf("%s" , "Ujjwal"); //Ujjwal 
			System.out.println(); //  No change
		System.out.printf("%c" , 'U'); //U 
			System.out.println(); // no change
		System.out.printf("%C" , 'u'); //U 
			System.out.println(); // Uppercase kr deta h
//------------------Numbers-------------------------------------------------
		System.out.printf("%f" , 10.1); // 10.100000 
			System.out.println();	// float me krdeta h
		System.out.printf("%e",10.02300); //1.002300e+01
			System.out.println();
		System.out.printf("%e" , 10.023); //1.002300e+01
			System.out.println();
//-------------------Boolean----------------------------------------------------
		System.out.printf("%B" , 5<4); // FALSE 
			System.out.println(); // (uppercase print)
		System.out.printf("%b " , 5<4); // false 
			System.out.println(); // (lowercase print)
		System.out.printf("%b" , null); // false 
			System.out.println();
		System.out.printf("%b" , "Cow"); // true 
			System.out.println(); // ~ compiler ko bhi nhi pt yha pe kya krna h! isliye  true return kr deta h
//-------------------------------------------------------------------------------
		System.out.printf("%o" , 10); // 12 			
			System.out.println(); // will be converted to octal form  Strings me v use ho skta h
		System.out.printf("%X " , 10);	// A
			System.out.println(); // will converted to Hexadecimal form (Capital Letters)
		System.out.printf("%x " , 10); // a
			System.out.println(); // will converted to Hexadecimal Form(Small Letter)
		System.out.printf("%h" , 1000); // 3e8
			System.out.println(); // hash code (Lower Case Letter)
		System.out.printf("%H" , 1000); // 3E8
			System.out.println(); // hash code (Upper Case Letter)
		System.out.printf("%a" , 10.12); // 0x1.43d70a3d70a3dp3
			System.out.println(); // hash code for decimal number
		System.out.printf("%A" , 10.12); // 0X1.43D70A3D70A3DP3
			System.out.println();// hash code for decimal number (Upper Case)
//		--------------------------------------------------------------------------------
//			Extras. Out of the above catagories.
			Calendar cal = Calendar.getInstance();
			System.out.printf("%TB" , cal); // March 
				System.out.println();	// yha pe t ar b ka value zaada h to please check and lookj into it.
			
	}
}
