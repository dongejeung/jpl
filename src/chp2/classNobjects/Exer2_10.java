package chp2.classNobjects;

// Vehicle class with main method
public class Exer2_10 {
	private double speed;
	private double directionDegree;
	private String owner;
	
	public Exer2_10() {
		
	}
	public Exer2_10(String ownerName) {
		this.owner = ownerName;
	}
	
	public void chgSpeed(double speed) {
		this.speed = speed;
	}
	public void stop() {
		this.speed = 0;
	}
}
