package Input;
/*	Use of Readline Method
 * 	The Readline method is available in java.io.package
 * 	
 */
// Syntax
/*	
 * 	public String readLine() throws IOE exception
 * 	{
 * 			Enter Code Here
 * 	}
 * 	
 * This Code is present in BufferedReader and DataInputStream class , Both the classes are present in java.io.package.
 * The given input is always in string so the programmer must give IOException.
 * 
 */

import java.io.*;
class a_Concept
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter The Data from the keyboard ");
			String s = br.readLine();
		System.out.println("Output is "+s);
		
	}
}