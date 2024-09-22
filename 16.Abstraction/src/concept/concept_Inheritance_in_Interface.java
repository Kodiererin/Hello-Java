package concept;

// Just like we can extend class from one to another...
// like that only we can extend the one  interface to another interface and so on.
// we cannot extend interface to class or class to interface................
interface MyInterface01
{
	void intro1();
	void intro2();
}
interface MyInterface2 extends MyInterface01
{
	void intro3();
	void intro4();
}
class UjjwalFinal implements MyInterface2
{
	public void intro1()
	{
		System.out.println("Good Morning Respected Teacher and my dear friends.");
	}
	public void intro2()
	{
		System.out.println("My name is UJJWAL KUMAR. I am a student of Institiute of Technical institute formally known as Siksha 'O' Anusandhan.");
	}
	public void intro3()
	{
		System.out.println("I did my schooling from DE NOBILI SCHOOL Digwadih Dhanbad.");
	}
	public void intro4()
	{
		System.out.println("I belong to the Black Diamond City of INDIA known as Dhanbad, Jharkhand.");
	}
}
public class concept_Inheritance_in_Interface 
{
	public static void main(String[] args) 
	{
		UjjwalFinal uf1 = new UjjwalFinal();
		uf1.intro1();
		uf1.intro2();
		uf1.intro3();
		uf1.intro4();
	}
}
