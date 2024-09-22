package concept_BinaryHeap;

class myHeap
{
	int[] arr;
	int size;
	int capacity;

	myHeap(int capacity)
	{
		this.capacity = capacity;
		arr = new int[this.capacity];
		this.size = 0;
	}
	int parent(int i)
	{
		return (int) Math.floor((i-1)/2);
	}
	int left(int i)
	{
		return 2*i + 1;
	}
	int right(int i)
	{
		return 2*i+2;
	}
	public void insert(int x)
	{
		if(this.capacity==this.size)
		{
			return;
		}
		size++;
		arr[this.size-1] = x;
		for(int i=this.size-1 ; i!=0 && arr[parent(i)]>arr[i];)
		{
			int temp = arr[i];
			arr[i] = arr[parent(i)];
			arr[parent(i)] = temp;
			i = parent(i);
		}
	}

}
public class e_DecreaseKey
{
	public static void main(String[] args)
	{
		myHeap obj = new myHeap(10);
		for(int i=0 ; i<10 ; i++)
		{
			int random = ((int)(Math.random()*10)+1);
			System.out.println("Random Function "+((int)(Math.random()*10)+1));
			obj.insert(random);
		}

		for (int element : obj.arr) {
			System.out.println(element);
		}
	}
}
