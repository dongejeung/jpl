package chp1.quicktour;

public class Exer1_12 {
	/*
	 * 	omission
	 */
	public static void main(String[] args) throws Exception{
		try {
			
		}catch (Exception e) {
			
		}finally {
			
		}
		
	}
}

class BadDataSetException extends Exception {
	private String setName;

	public BadDataSetException(String setName) {
		System.out.println("fileName : " +this.setName+ " can't be loaded") ;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}
	
	
}