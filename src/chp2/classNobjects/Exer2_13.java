package chp2.classNobjects;

// Vehicle class
public class Exer2_13 {
	private double speed;
	private double degrees;
	private String owner;
	
	private long ID = 0;
	private static long nextID = 0;
	private final double MAX_DEGREES = 360.0;
	private final double TURN_LEFT = -90.0; // change direction by adjust degrees
	private final double TURN_RIGHT = 90.0;
	
	// static initializer block
	static {
		
	}
	// initializer block (Instance)
	{
		ID = nextID;
		nextID++;
	}
	
	public Exer2_13() {
//		ID = nextID++;
	}
	public Exer2_13(String ownerName) {
//		ID = nextID++;
		this.owner = ownerName;
	}
	
	public long getID() {
		return ID;
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
	
	public static long getMaxID( ) {
		return nextID;
	}
}
