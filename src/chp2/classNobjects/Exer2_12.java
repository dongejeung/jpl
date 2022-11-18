package chp2.classNobjects;

// Vehicle class
public class Exer2_12 {
	private double speed;
	private double degrees;
	private String owner;
	
//	private final double MAX_DEGREES = 360.0;
	private final double TURN_LEFT = -90.0; // change direction by adjust degrees
	private final double TURN_RIGHT = 90.0;
	
	public Exer2_12() {
		
	}
	public Exer2_12(String ownerName) {
		this.owner = ownerName;
	}
	
	public void chgSpeed(double speed) {
		this.speed = speed;
	}
	public void stop() {
		this.speed = 0;
	}
	
	public void turnLeft() {
		this.degrees += this.TURN_LEFT;
	}
	public void turnRight() {
		this.degrees += this.TURN_RIGHT;
	}
	
}
