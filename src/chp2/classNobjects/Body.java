package chp2.classNobjects;

public class Body {
	private long idNum;
	public String name ="<unnamed>";
	public Body orbits = null;
	
	private static long nextID = 0;
	
	Body() {
		idNum = nextID++;
	}
	Body(String bodyName, Body orbitsAround) {
		this();
		this.name = bodyName;
		this.orbits = orbitsAround;
	}
}
