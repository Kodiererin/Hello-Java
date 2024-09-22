package concept_BinaryHeap;


public class Heap_Datastructure {
//	This is The Min Heap Implementation
	static class MyHeap{
		int [] arr;
		int size;
		int capacity;
		MyHeap(int c){
			arr = new int[c];
			this.size= 0;
			this.capacity = c;
		}
		
		static int left(int i) {
			return (2*i)+1;
		}
		
		static int right(int i) {
			return (2*i)+2;
		}
		
		static int parent(int i) {
			return (int)Math.floor((i-1)/2);
		}
		
		public int[] getArr() {
			return arr;
		}

		public void setArr(int[] arr) {
			this.arr = arr;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		
//		insertHeapion in the Heap
		public void insertHeap(int data) {
//			Increase the size.
//			And We compare its and move with the loop.
			if(size==capacity) {
				return;
			}else {
				size++;
				arr[size-1] = data;
				for(int i=size-1 ; i!=0 && parent(i)>arr[i]; ) {
					swap(arr,i,parent(i));
					i = parent(i);
				}
			}
		}
		
		public static  void swap(int [] arr , int i , int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		public static  void displayHeap(MyHeap heap) {
			for(int i=0 ; i<heap.size ; i++) {
				System.out.println(heap.arr[i]);
			}
		}
		
		
//		Heapify Operation
//		Used for Extract minimun and Build Heap.
//		Creating a Min Heapify
//		Binary Heap is Internally an Array!
		
//		Function i/p is the Index which is violating the MinHeap Property
		public  void HeapiFy(int i) {
			int parent = parent(i);
			int left = left(i);
			int right = right(i);
			int smallest = 0;
			
			if(left< this.size && arr[left]<arr[i]) {
				smallest = left(i);
			}
			if(right<this.size && arr[right]<arr[i])
				smallest = right(i);
			if(smallest<left)
			{
				this.swap(arr,i,smallest);
				HeapiFy(smallest);
			}
			
		}

		
	}
	
	public static void main(String[] args) {
		MyHeap heap = new MyHeap(10);
		heap.insertHeap(20);
		heap.insertHeap(30);
		heap.insertHeap(15);
		heap.insertHeap(5);
		
		heap.arr[6] = 3;
		heap.arr[8] = 7;
		
		
		MyHeap.displayHeap(heap);
		System.out.println("The Heap Size is "+heap.size);
	}

}
