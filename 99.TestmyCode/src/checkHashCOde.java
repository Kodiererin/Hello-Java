class TestHash<T>
{
	T obj1;
	T obj2;
	TestHash(T var1 , T var2)
	{
		this.obj1 = var1;
		this.obj2 = var2;
	}
	boolean check()
	{
		if(obj1.hashCode()==obj2.hashCode())
			return true;
		else
			return false;
	}
	void show()	
	{
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}
}
public class checkHashCOde 
{
	public static void main(String[] args) 
	{
		TestHash  obj = new TestHash("1" , "2");
		System.out.println(obj.check());
		obj.show();
	}  
}
