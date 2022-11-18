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
