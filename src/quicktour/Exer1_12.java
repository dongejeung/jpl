package quicktour;

public class Exer1_12 {
	/*
	 * 	omission
	 */
}

class BadDataSetException extends Exception {
	private String setName;
//	private String format;
//	private String errStatement;
	public BadDataSetException() {
		System.out.println("fileName : " +setName+ " can't be loaded") ;
	}
}