package concept_BinaryHeap;

public class a_Intro {
//	### Binary Heap Datastructure is Used to implement Heap Sort.
//	It is  also used to implement Priority Queue infact main implementation of Heap DS is to use Priority Queue.
//
//	Priority Queue is used in many Standard Algorithm Like Dikshahtra Shortest
//	Path Algorithm, Prims Minimum Spanning tree Algorithm Huffman Coding .
//
//	In Situations where items have queue and These items have priorities you use a
//	Priority Queue Data Structure .
//
//	Example : Doctors Queue : There are multiple patients who want to consult a doctor. Every Patient is assigned a Priority, and doctor visits the highest Priority Patient next and Once the highest Priority patient is visited then next highest Priority patient is visited.
//
//	## There are two ways to assign a Priority to a Person.
//
//	1. The Lowest Number is assigned to a person meet the highest then this is what is we called MINHEAP.
//	******In MIN HEAP Highest priority is assigned to the Lowest Value.******
//	2. In ********************Max Heap********************  ********************items is assigned to the Highest Value.
//	When we want to remove the Person from the Priority queue we remove the Person with Highest Value.********************
//
//	    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/27c53478-7c8c-4cbf-aa5e-7e122eb4dead/Untitled.png)
//
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71c95e2e-e3a1-4840-9f1b-892c5c34fe2c/Untitled.png)
//
//	---
//
//	## A Binary Heap is a Complete Binary Tree.
//
//	****************************************************A Binary tree is said to be complete if its all levels are completely filled except possibly the last Level.****************************************************
//
//	******************************************************************And the Last level must be filled from left to right.******************************************************************
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ffb18375-2090-4ea0-836b-0c2a070d7ff2/Untitled.png)
//
//	********Complete Binary Tree. : Although the last level is Not filled but the nodes are filled from Left to Right.********
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1adc8442-37a3-4e54-8c94-167edb3dfd04/Untitled.png)
//
//	**************************************************Not Complete Binary Tree  : Because the second level is not completely Filled.**************************************************
//
//	1. So a Complete Binary tree must be filled from left to right. although the leaf Node is not needed to be filled.
//
//	### Advantage of Such A Structure.
//
//	**************************************Ques :Why Do we need to restrict the Binary Heap to a Binary Tree?
//	ans   :************************************** The reason we need to restrict the Binary Heap to a Binary Tree is Because we want to **Store Binary Heap Data structure as an Array**.
//
//	We need to store Binary Tree Elements into an Array and to minimise the gaps in the Array We need to use Binary Heap Data structure and Holding Proper Parent Child Relationship
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/67d2b9f7-122d-40cc-a7e2-33d9d596cfa6/Untitled.png)
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e0bd381d-63b8-45d9-bad4-dfe4d9107c40/Untitled.png)
//
//	Left(item) = 2i+1;
//
//	Right(item) 2i+2;
//
//	Parent : Math.floor((i-1)/2);
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/59b0b755-f25f-4017-92b7-f56a81839ff4/Untitled.png)
//
//	****************************Advantages of such a structure and Element allocation.
//	1.**************************** You have random access to any elements at contigous elements.
//	******2.****** Which can be represented as an array without wasting any space.
//	******3.****** Cache Friendly : all the elements are at contigous elements so they have a  locality of reference.
//	**4.** It is a Complete binary tree. So the Height of the tree is completely Possible, Most of the operation depends on the height of the tree, eg: Heapify DS, Insert Operation.
//
//	---
//
//	# MIN Heap Data Structure.
//
//	1. ******************************Complete Binary Tree.******************************
//	2. **************Every Node has Value smaller than its descendants.
//	Decendents : Papa ka Value km h lekin beta ka Value zaada h!**************
//
//	 ************************************************************************************************Note : Min Heap Actually represented as an array.************************************************************************************************
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5c88bde-90bb-44be-a0c0-9d128eea453c/Untitled.png)
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6424d0b4-d594-4ce4-b7ef-120ca50b7f4d/Untitled.png)
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b10fc929-ad4a-479b-8c30-23975329520a/Untitled.png)
//
//	**************Actual Representation of Heap in the Memory.**************
//
//	---
//
//	## Which of the Below is the Min Heap?
//
//	![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1cac20a6-656c-4e5c-a72a-e96b24fd1828/Untitled.png)
//
//	1. This is not a Min Heap Because it is not a Binary Tree
//	2. This is also not a Min Heap because Decendent must have the smallest value than its Child.
//	3. This is a Min Heap.
//	It follows both the properties :
//	    1.  It is a Complete Binary Tree.
//	    2. Every Node is Smaller than its decendents.
}
