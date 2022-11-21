package chp3.extendingclasses;

public class OverOccupiedException extends Exception {
	public OverOccupiedException(int availSeats, int occupiedSeats) {
		System.out.print("available seats count is " + availSeats);
		System.out.println(", but try to occupiedSeats count is " +occupiedSeats);
	}
}
