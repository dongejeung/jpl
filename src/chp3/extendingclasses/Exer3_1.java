package chp3.extendingclasses;

import chp2.classNobjects.Exer2_8;

// PassengerVehicle extends Vehicle
public class Exer3_1 extends Exer2_8 {
	private int availSeats;
	private int occupiedSeats = 0;
	
	public Exer3_1() {
		super();
	}

	// Constructor using super's
	public Exer3_1(String ownerName) {
		super(ownerName);
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	public int getOccupiedSeats() {
		return occupiedSeats;
	}

	// Exception handling is further work.
	public void setOccupiedSeats(int occupiedSeats) throws Exception {
		if(occupiedSeats > this.availSeats)
			throw new OverOccupiedException(availSeats, occupiedSeats);
		this.occupiedSeats = occupiedSeats;
	}
	
	// if super's main doesn't throws Exception occur compile Err.
	public static void main(String[] args) throws Exception {
		// p means passenger
		Exer3_1 pVehicle = new Exer3_1("DON");
		Exer3_1 pVehicle2 = new Exer3_1("Jung");
		
		try {
			pVehicle.setAvailSeats(4);
//			pVehicle.setOccupiedSeats(5);
			pVehicle.setOccupiedSeats(4);

			pVehicle2.setAvailSeats(4);
			pVehicle.setOccupiedSeats(3);
		}catch(OverOccupiedException oe) {
			
		}catch(Exception e) {
			
		}finally {
			// To-Do : toString method implement super & this.
			System.out.println(pVehicle.getOccupiedSeats());
		}
	}
	
}
