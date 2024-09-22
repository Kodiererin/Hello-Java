package s_1_String;


//	Strings
//	A String is a sequence of characters.
//	The reason that make string Special is Small set of elements.
//	String has 20 characters if lower case.
//	There are 128 Standard ASCII values.
//	That Covers most of the characters and have 32 controlled Characters (which are the first 32 eg : @#$%^&)
//	These limited set of characters make String Special.
//	A-Z 26 characters and a-z Character

//	C/C++ use ASCII which store datatype of 8 Bits.
//	ASCII is one of the oldest form String.
//	Why 128 characters? Historically we have parity bit and so in todays life we use extended ASCII values which have the capacility of storing 256 ASCII Values.
//	C also has the datatype wchat_it to store Unicode Characters.
//	String class uses 8 bit char.

//	In Java datatype is UTF-16 and is store in 16 bit.
//	UTF-16 is the Unicode Standard Format.
//	Why Unicode?
//	In Ascii we could only store English Variables and there was a need to store other languages
//	And that is why Unicode was created. Unicode stores 16 bits of characters.
//	and the great thing of Unicode is then first 126 characters are same as ASCII.
//	in UNICODE-16, 16 is the version of the Unicode.
//	A - 65 and a - 97  are the contiguous Values.
//	String in Java uses UTF-16 values.

class play
{
	public static void play1()
	{
		for(int i=97 ; i<(97+26) ; i++)
		{
			System.out.println((char)i);
		}
	}
//	Problem 1>: Print frequence of Character(in Sorted order) in a string of lower case Alphabet
	public static void playFrequency(String str)
	{
		str = str.toLowerCase();
//		we are creating an array for 26 characters.
//		index 0 = a , index 1 = b , index c = d and so on..
//		We traverse individual characters throuch indexes.
		int count[] = new int[26];
		for(int i=0 ; i<str.length() ; i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(int i=0 ; i<26 ; i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)(i+'a')+" "+count[i]);
			}
		}
	}
//	This is 26 length so It is considered as Constant Loop!.
}
public class a_Intro
{
	public static void main(String[] args)
	{
		play.play1();
		play.playFrequency("Ujjwal");
	}
}
