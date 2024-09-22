package a_1_Linked_List;

public class test_OddEvenLL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
//	Creating the Linked List
	public static void create() {
		Node Head = new Node(1);
		Node temp = Head;
		for(int i=0 ; i<10 ; i++) {
			Node a = new Node(i+2);
			temp.next = a;
			temp = a;
		}
		display(Head);
		compute(Head);
//		display(Head);
	}
	
//	Testing Begins
	public static void compute(Node Head) {
		Node a = Head.next;
		Node b = Head.next.next;
		while(true) {
			Node temp = a;
			a.data = b.data;
			b.data = temp.data;
			if(a.next!=null && a.next.next!=null)
				a = a.next;
			if(b.next!=null && b.next.next!=null) {
				b = b.next.next;
			}else {
				break;
			}
		}
		display(Head);
	}
	
	
	
//	Display the LL
	public static void display(Node Head) {
		if(Head==null) {
			System.out.println();
			return;
		}
		System.out.print(Head.data+" ");
		display(Head.next);
	}
	public static void main(String[] args) {
		create();
	}
}
