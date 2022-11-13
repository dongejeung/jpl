package chp2.classNobjects;

// Vehicle class with main method
public class Exer2_6 {
	public double speed;
	public double directionDegree;
	public String owner;
	
	public Exer2_6() {
		
	}
	public Exer2_6(String ownerName) {
		this.owner = ownerName;
	}
	public static void main(String[] args)	{
		Exer2_6 vehicle1 = new Exer2_6("DON");
		vehicle1.speed = 15; vehicle1.directionDegree = 60;
		Exer2_6 vehicle2 = new Exer2_6("Jung");
		vehicle2.speed = 15; vehicle2.directionDegree = 100;
		Exer2_6 vehicle3 = new Exer2_6("Park");
		vehicle3.speed = 15; vehicle3.directionDegree = 150;
		
		System.out.println(vehicle1.speed+ " / " +vehicle1.directionDegree+ " / " +vehicle1.owner);
		System.out.println(vehicle2.speed+ " / " +vehicle2.directionDegree+ " / " +vehicle2.owner);
		System.out.println(vehicle3.speed+ " / " +vehicle3.directionDegree+ " / " +vehicle3.owner);

	}
}
