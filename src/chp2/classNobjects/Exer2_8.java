package chp2.classNobjects;

// Vehicle class with main method
public class Exer2_8 {
	private double speed;
	private double directionDegree;
	private String owner;
	
	public Exer2_8() {
		
	}
	public Exer2_8(String ownerName) {
		this.owner = ownerName;
	}
	public static void main(String[] args)	{
		Exer2_8 vehicle1 = new Exer2_8("DON");
		vehicle1.speed = 15; vehicle1.directionDegree = 60;
		Exer2_8 vehicle2 = new Exer2_8("Jung");
		vehicle2.speed = 15; vehicle2.directionDegree = 100;
		Exer2_8 vehicle3 = new Exer2_8("Park");
		vehicle3.speed = 15; vehicle3.directionDegree = 150;
		
		System.out.println(vehicle1.speed+ " / " +vehicle1.directionDegree+ " / " +vehicle1.owner);
		System.out.println(vehicle2.speed+ " / " +vehicle2.directionDegree+ " / " +vehicle2.owner);
		System.out.println(vehicle3.speed+ " / " +vehicle3.directionDegree+ " / " +vehicle3.owner);

	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDirectionDegree() {
		return directionDegree;
	}
	public void setDirectionDegree(double directionDegree) {
		this.directionDegree = directionDegree;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
