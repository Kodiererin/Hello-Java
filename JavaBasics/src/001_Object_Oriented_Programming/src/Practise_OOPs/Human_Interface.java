package Practise_OOPs;
interface Monkey
{
	void jump();
	void bite();
}
interface basicAnimal
{
	void eat();
	void sleep();
}
class Human implements Monkey,basicAnimal 
{
	public void jump()
	{
		System.out.println("Jump ");
	}
	public void bite()
	{
		System.out.println("Bite");
	}
	public void eat()
	{
		System.out.println("Bite");
	}
	public void sleep()
	{
		System.out.println("Sleep");
	}
}
public class Human_Interface
{
	public static void main(String[] args) 
	{
		Human hf1 = new Human();
		hf1.bite();
		hf1.jump();
		hf1.sleep();
		hf1.eat();
	}
}
