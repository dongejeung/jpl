package chp2.classNobjects;

import java.util.Iterator;

// Vehicle class => pass owners with main(cmd) and ...
public class Exer2_15 {
	private double speed;
	private double degrees;
	private String owner;
	
	private long ID = 0;
	private static long nextID = 0;
	private final double MAX_DEGREES = 360.0;
	private final double TURN_LEFT = -90.0; // change direction by adjust degrees
	private final double TURN_RIGHT = 90.0;
	
	// args are car owner's name
	public static void main(String[] args) {
		// 변수 명을 짓기 애매해서 Car(Exer2_15) type 배열에 담아버리자.
		Exer2_15[] carArr = new Exer2_15[args.length];
		for(int i=0; i < args.length; i++) {
			carArr[i] = new Exer2_15(args[i]);
			System.out.println(carArr[i].owner);
		}
	}
	
	// static initializer block
	static {
		
	}
	// initializer block (Instance)
	{
		ID = nextID;
		nextID++;
	}
	
	public Exer2_15() {
//		ID = nextID++;
	}
	public Exer2_15(String ownerName) {
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
