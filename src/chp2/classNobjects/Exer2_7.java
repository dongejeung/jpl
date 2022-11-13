package chp2.classNobjects;

// LinkedList with Vehicle Objects
public class Exer2_7 {
	public Object obj;
	public Exer2_7 nextNode;
	
	public Exer2_7() {
		
	}
	public Exer2_7(Exer2_6 vehicle) {
		this.obj = vehicle;
	}
	
	public static void main(String[] args) {
		Exer2_7 node1 = new Exer2_7(new Exer2_6("DON"));
		Exer2_7 node2 = new Exer2_7(new Exer2_6("Jung"));
		
		/*
		Exer2_1 vehicle1 = new Exer2_1();
		Exer2_1 vehicle2 = new Exer2_1();

		node1.obj = vehicle1;
		node2.obj = vehicle2;
		*/
		
		node1.nextNode = node2;
		node2.nextNode = null;
	}
	
}
