package g_GreedyAlgo;

import java.util.PriorityQueue;

class Code{
	char c;
	int frequency;
	Code(char c , int frequency){
		this.c = c;
		this.frequency = frequency;
	}
}

class Node{
	char ch;
	int freq;
	Node left;
	Node right;
	Node(char c , int f , Node l , Node r){
		this.ch = c;
		this.freq = f;
		this.left = l;
		this.right = r;
	}
}


public class e_HuffmanCoding {
	public static void main(String[] args) {
//		Creating Code-Frequeny Array.
		Code []code = {new Code('A',10),new Code('D',50),new Code('B',20),new Code('E',40),new Code('F',80),};	
		prihtHCodes(code);
	}
	
	static void prihtHCodes(Code[] codes) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>((n1,n2)->n1.freq-n2.freq);
//		Priority Queue : We Say this is a Min Heap.
		for(int i=0 ; i<codes.length ; i++) {
			queue.add(new Node(codes[i].c , codes[i].frequency , null ,null));
		}
		while(queue.size()>1) {
			Node l = queue.poll();
			Node r = queue.poll();
			
			queue.add(new Node('$',l.freq+r.freq,l,r));
		}
		
		printRec(queue.peek(),"");
	}

	 static void printRec(Node peek, String string) {
		if(peek.ch!='$') {
			System.out.println(peek.ch+" "+string);
			return;
		}
		printRec(peek.left, string+"0");
		printRec(peek.right, string+"1");
	}
}
