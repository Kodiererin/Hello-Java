package concept_BinaryHeap;

class tHeap
{
	int[] arr = {1, 10, 2, 10, 7, 8, 7, 4, 5, 5 };
	int size = arr.length;
	int capacity = arr.length;

	int left(int i)
	{
		return (2*i+1);
	}
	int right(int i)
	{
		return 2*i+2;
	}
	int parent(int i)
	{
		return (int)Math.floor((i-1)/2);
	}

	public void minHeap(int i)
	{
		int lt = this.left(i);
		int rt = this.right(i);
		int smallest = i;
		if(arr[lt]<size && lt<smallest)
			smallest = lt;
		if(rt<size && arr[rt]<smallest)
			smallest = rt;
		if(smallest!=i)
		{
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeap(smallest);
		}
	}
}
public class test_HEap1
{
	public static void main(String[] args)
	{
		tHeap obj = new tHeap();
		System.out.println("{1, 11, 2, 10, 7, 8, 9, 4, 5, 6 }");
		obj.minHeap(0);
		for (int element : obj.arr) {
			System.out.print(element+" ");
		}
	}
}
