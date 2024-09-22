package concept_BinaryHeap;

public class MinHeap
{
	int [] arr = {10,5,20,2,4,8};
	int size = arr.length;
	int capacity = arr.length;
//	MinHeap(int c)
//	{
//		arr = new int[c];
//		size = 0;
//		capacity = c;
//	}

	int left(int i)
	{
		return (2*i+1);
	}
	int right(int i)
	{
		return (2*i+2);
	}
	int parent(int i)
	{
		return (i-i)/2;
	}

	public int[] buildHeap()
	{
		int bottomRightParent = (int)Math.floor((size-1-1)/2);
		for(int i=bottomRightParent ; i>=0 ; i--)
		{
			minHeapify(i);
		}
		return arr;
	}
	public void minHeapify(int i)
	{
		int lt = 2*i+1;
		int rt = 2*i+2;
		int smallest = i;
		if(lt<size && arr[lt]<smallest)
			smallest = lt;
		if(rt<size && arr[rt]<smallest)
			smallest = rt;
		if(smallest!=i)
		{
//			Swapping the Values;
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(smallest);
		}
	}
	public static void main(String[] args)
	{
		MinHeap obj = new MinHeap();
		int[] xyz = new int[obj.arr.length];
		xyz = obj.buildHeap();
		for(int i=0 ; i<obj.arr.length ; i++)
		{
			System.out.println(xyz[i]);
		}
	}
}
