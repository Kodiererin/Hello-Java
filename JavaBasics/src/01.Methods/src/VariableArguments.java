class VariableArguments
{
	static int sum(int ...arr)
	{
		int result = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			result = result + arr[i];
		}
		return result;
	}
	public static void main(String[] args)
	{
		int mamu = sum(4,5,7,9);
		System.out.println(mamu);
		System.out.println("The sum of the Variables is ="+sum(32,43,54,65,76,87));
	}
}