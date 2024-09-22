package ArrayFor_Objects;
public class class_ArrayForObjects 
{
	int x;
	public static void main(String[] args) 
	{
		class_ArrayForObjects [] array = new class_ArrayForObjects [3];
		array[0] = new class_ArrayForObjects ();
			array[0].x = 1;
		array[1] = new class_ArrayForObjects ();
			array[1].x = 2;
		array[2] = new class_ArrayForObjects ();
			array[2].x = 3;
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(array[i].x);
		}
	}
}
