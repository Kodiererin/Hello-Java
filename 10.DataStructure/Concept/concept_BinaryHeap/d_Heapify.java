package concept_BinaryHeap;

class minHeap2
{
	int arr[];
	int capacity;
	int size;
	minHeap2(int cap)
	{
		this.capacity = cap;
		this.arr = new int[this.capacity];
		this.size = 0;
	}
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


	public void insert(int x)
	{
		if(size==capacity)
			return;
		size++;
		arr[size-1] = x;
		for(int i=size-1 ; i!=0 && arr[parent(i)]>arr[i];)
		{
			int temp = arr[i];
			arr[i] = arr[parent(i)];
			arr[parent(i)] = temp;
			i = parent(i);
		}
	}

	public void minHeapify(int i)
	{
		int lt = left(i);
		int rt = right(i);
		int smallest = i;
		if(lt<size && arr[lt] <arr[i])
		{
			smallest = lt;
		}
		if(rt<size && arr[rt]<arr[smallest])
			smallest = rt;
		if(smallest!=i)
		{	// swapping the Values
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(smallest);
		}
	}
	public int extractMin()
	{
		if(size<=0)
		{
			return Integer.MAX_VALUE;
		}
		if(size==1)
		{
			size--;
			return arr[0];
		}
		int temp = arr[0];
		arr[0] = arr[size-1];
		arr[size-1] = temp;
		size--;
		minHeapify(0);

		return arr[size];
	}
}
public class d_Heapify
{
	public static void main(String[] args)
	{
		minHeap2  obj= new minHeap2(10);
//		h.insert(3);;
//		h.insert(2);
//		h.insert(15);
//		h.insert(20);
//		System.out.println(h.extractMin());
//		myHeap obj = new myHeap(10);
		System.out.println("Inserted Function :->");
		obj = {1, 10, 2, 10, 7, 8, 7, 4, 5, 5 };
		System.out.println();
		for (int element : obj.arr) {
			System.out.print(element+" ");
		}
		obj.minHeapify(0);
		System.out.println("AFter Min HEapify");
		for (int element : obj.arr) {
			System.out.print(element+" ");
		}

	}
}
