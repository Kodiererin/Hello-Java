package concept_BinaryHeap;

class MyHeap{
	int arr[];
	int size;
	int capacity;
	
	MyHeap(int capacity){
		arr = new int[capacity];
		this.size = 0;
		this.capacity = capacity;
	}
	
//	to get the left of the Index
	int left(int i) {
		return (2*i)+1;
	}
//	to get the right index 
	int right(int i) {
		return (2*i)+2;
	}
//	To get the parent
	int parent(int i) {
		return (int)Math.floor((i-1)/2);
	}
	
//	Insertion at Heap
	public  void insertion(int data) {
		if(this.size == this.capacity)
			System.out.println("The Heap is Full");
		else {
			this.size ++;
			this.arr[this.size-1] = data;
			for(int i=this.size-1; i!=0 && this.parent(i)>arr[i];) {
//				Swapping of data
				swap(arr, parent(i), i);
				i = parent(i);
			}
		}
	}
	public void swap(int[] arr , int index1 , int index2) {
		int temp = this.arr[index1];
		this.arr[index1] = this.arr[index2];
		this.arr[index2] = temp;
	}
	
//	Heapify Operation
//	THis is a Min Heapify Operation
	public void minHeapify(int i) {
		int leftNode = left(i);
		int rightNode = right(i);
		int smallest = i;
		
		if(leftNode<size && arr[leftNode]<arr[smallest]) {
			smallest = leftNode;
		}
		if(rightNode<size && arr[rightNode]<arr[smallest]) {
			smallest = rightNode;
		}
		if(smallest!=i) {
//			Swapping of Data
			swap(arr,smallest,i);
			minHeapify(smallest);
		}
	}
	
	
//	Extract Min from Heapify
	public int extractMin() {
		if(this.size<0)
			return Integer.MAX_VALUE;
		if(this.size==1)
		{
			this.size--;
			return arr[0];
		}
		swap(arr,0,this.size-1);
		this.size--;
		return arr[size];
	}
	
//	Display of thhe Data
	public void display() {
		for(int i=0 ; i<this.size ; i++) {
			System.out.println(this.arr[i]);
		}
	}
}


public class Heap_DataStructuree {

}
