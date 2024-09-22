package concept_BinaryHeap;
import concept_BinaryHeap.MinHeap;

public class c_Insert
{
//	Write Down a Function that inserts a valu in Min-Heapp and time complexity of the function should be Log(h)
//	where h is the height of the Heap Data Structure.

//	## So what do we do in insert?
//
//			1. We first increment the size.
//			2. We take the element and insert it into the last index.
//			3. After that we compare the inserted item with its parent and if the parent is greater then we swap its node with the parent and we change the current node with the parent.
//			4. And we repeat this thing in a loop.
//			5. And we come out of the loop when the current element is greater than its parent or we have reached the root.
//			6. ************************************************************************************Time Complexity of the Operation :
//			Insertion : Big-Oh(1)
//			Then we are traversing the Tree : Log(h)
//			H→ Height of the tree

//	So insertion operation is Log(h)

//	This is a very basic implementation In Realtime the Binary Heap uses Dynamic size arrays which resize themselves when you insert them.

	void insert(int x)
	{
		if(size==capacity)
			return;
		size++;
		arr[size-1] = x;
		for(int i=size-1 ; i!=0 && arr[parent[i]]>arr[i])
		{
			swap(arr[i] , arr[parent(i)]);
			i = parent(i);
		}

	}
}
