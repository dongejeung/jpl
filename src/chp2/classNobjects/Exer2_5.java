package chp2.classNobjects;

// LinkedList with Vehicle Objects
public class Exer2_5 {
	public Object obj;
	public Exer2_5 nextNode;
	
	public static void main(String[] args) {
		Exer2_5 node1 = new Exer2_5();
		Exer2_5 node2 = new Exer2_5();
		
		Exer2_1 vehicle1 = new Exer2_1();
		Exer2_1 vehicle2 = new Exer2_1();

		node1.obj = vehicle1;
		node2.obj = vehicle2;
		
		node1.nextNode = node2;
		node2.nextNode = null;
	}
}
