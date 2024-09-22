package e_concept_Graph;

class createWeight{
	int source;
	int destination;
	int weight;

	createWeight(int source , int destination , int weight){
		this.destination = destination;
		this.source = source;
		this.weight = weight;
	}
	public int getSource() {
		return this.source;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getDestination() {
		return this.destination;
	}
}
public class j_FordFulkersonAlgo {
	public static void createList(java.util.ArrayList<java.util.ArrayList<Integer>> list , int a , int b) {
		list.get(a).add(b);
//		Creating a Directed Graph.
	}
	public static void createList() {
		java.util.ArrayList<java.util.ArrayList<Integer>> list = new java.util.ArrayList<>(8);
		for(int i=0 ; i<8 ; i++) {
			list.add(new java.util.ArrayList<Integer>());
		}
		createList(list, 0, 1);
		createList(list, 0, 5);
		createList(list, 1, 2);
		createList(list, 2, 3);
		createList(list, 3, 4);
		createList(list, 1, 5);
		createList(list, 5, 6);
		createList(list, 6, 7);
		createList(list, 7, 4);

//		Creating A Weighted Array
		createWeight[] weight = new createWeight[9];
		weight[0] = new createWeight(0, 1, 3);
		weight[1] = new createWeight(1, 2, 3);
		weight[2] = new createWeight(1, 5, 6);
		weight[3] = new createWeight(0, 5, 3);
		weight[4] = new createWeight(5, 6, 3);
		weight[5] = new createWeight(2, 3, 7);
		weight[6] = new createWeight(3, 4, 7);
		weight[7] = new createWeight(6, 7, 2);
		weight[8] = new createWeight(7, 4, 3);

		compute(weight, list, 0, 4);
	}

//	Starting the Ford Fulkerson Algorithm
	public static void compute(createWeight[] weight , java.util.ArrayList<java.util.ArrayList<Integer>> list , int source , int destination) {
		System.out.println("Starting The Ford Fulkerson Algorithm");
		java.util.Queue<Integer> queue = new java.util.LinkedList<>();

		int maxFlow=0;

//		Initializing the weight
//		Initiating the Source;

//		Check the Code
//		Create a new Concept and Think of it
//		Go to Line 84 and Check what and how to add into the queue while traversing.
//		And Track the minweight.
//		And decrement with the min weight
//		And store in the Array, the weight.


//		Isko krna h Bhai!

		System.out.println(list.get(source));
		int minWeight = Integer.MAX_VALUE;
		queue.add(source);
		while(!queue.isEmpty()) {
			int u = queue.poll();
			System.out.println(u);
//			weight[u].weight-=minWeight;
			System.out.println("The Min Weight is "+minWeight);


//			Some conditions will be added.

			for (Integer element : list.get(u)) {
//				System.out.println(weight[u].getWeight());
//				if(weight[u].getSource()==i) {}

				if(weight[u].getWeight()>0) {
					minWeight = Math.min(minWeight, weight[u].getWeight());
					queue.add(element);
				}
			}
		}
	}

	public static void main(String[] args) {
		createList();
	}
}
