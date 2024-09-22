package Practise_OOPs;
import java.util.*;
class Game
{
	int userInput;
	int randomNumber;
	private int noOfGusses;
	public int getNoOfGusses() 
	{
		return noOfGusses;
	}
	public void setNoOfGusses(int noOfGusses) 
	{
		this.noOfGusses = noOfGusses;
	}	
	Game()
	{
		this.randomNumber = (int)(Math.random()*(100-1))+1;
//		System.out.println("The Random No = "+this.randomNumber);
	}
	public void takeUserInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
			this.userInput = sc.nextInt();		
	}
	public boolean isCorrectNumber()
	{
		this.noOfGusses++;
		System.out.println("No of Gusses = "+this.noOfGusses);
		if(this.randomNumber == this.userInput)
			return true;
		else
			return false;
	}
}
public class GuessTheNumber 
{
	public static void main(String[] args)
	{
		Game g1 = new Game()	;
		boolean b = false;
		while(!b)
		{
			g1.takeUserInput();
			b = g1.isCorrectNumber();
		}
	}
}