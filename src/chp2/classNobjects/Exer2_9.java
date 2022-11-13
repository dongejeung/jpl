package chp2.classNobjects;

// LinkedList with Vehicle Objects
public class Exer2_9 {
	private Object obj;
	private Exer2_9 nextNode;
	
	public Exer2_9() {
		
	}
	public Exer2_9(Exer2_6 vehicle) {
		this.obj = vehicle;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Exer2_9 getNextNode() {
		return nextNode;
	}
	public void setNextNode(Exer2_9 nextNode) {
		this.nextNode = nextNode;
	}

	public static void main(String[] args) {
		Exer2_9 node1 = new Exer2_9(new Exer2_6("DON"));
		Exer2_9 node2 = new Exer2_9(new Exer2_6("Jung"));
		
		node1.nextNode = node2;
		node2.nextNode = null;
		
		Exer2_8 privateVehicle = new Exer2_8("DON");
	}
	
}
