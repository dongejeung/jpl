package chp2.classNobjects;

// Vehicle class with main method
public class Exer2_4 {
	public double speed;
	public double directionDegree;
	public String owner;
	
	public static void main(String[] args)	{
		Exer2_4 vehicle1 = new Exer2_4();
		vehicle1.speed = 15; vehicle1.directionDegree = 60; vehicle1.owner = "DON";
		Exer2_4 vehicle2 = new Exer2_4();
		vehicle2.speed = 15; vehicle2.directionDegree = 100; vehicle2.owner = "Jung";
		Exer2_4 vehicle3 = new Exer2_4();
		vehicle3.speed = 15; vehicle3.directionDegree = 150; vehicle3.owner = "Park";
		
		System.out.println(vehicle1.speed+ " / " +vehicle1.directionDegree+ " / " +vehicle1.owner);
		System.out.println(vehicle2.speed+ " / " +vehicle2.directionDegree+ " / " +vehicle2.owner);
		System.out.println(vehicle3.speed+ " / " +vehicle3.directionDegree+ " / " +vehicle3.owner);

	}
}
