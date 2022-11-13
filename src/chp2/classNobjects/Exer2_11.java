package chp2.classNobjects;

// LinkedList with Vehicle Objects
public class Exer2_11 {
	private Object obj;
	private Exer2_11 nextNode = null;
	private int size = 1;
	public Exer2_11() {
		
	}
	public Exer2_11(Exer2_6 vehicle) {
		this.obj = vehicle;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Exer2_11 getNextNode() {
		return nextNode;
	}
	public void setNextNode(Exer2_11 nextNode) {
		this.nextNode = nextNode;
	}
	

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int size(Exer2_11 l) {
		if(l.nextNode != null) {
			this.size++;
			size(l.nextNode);
		}
		return this.size;
	}
	
	public static void main(String[] args) {
		Exer2_11 n = new Exer2_11();
		Exer2_11 n2 = new Exer2_11();
		Exer2_11 n3 = new Exer2_11();
		
		n.setNextNode(n2);
		n2.setNextNode(n3);
		
		System.out.println(n.size(n));
		System.out.println(n2.size(n2));
		System.out.println(n3.size(n3));
	}
}
