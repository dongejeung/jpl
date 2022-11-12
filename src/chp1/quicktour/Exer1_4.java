package chp1.quicktour;

import java.math.BigInteger;

class Exer1_4 {
	/** Print out the Factorial values < 50 */
	public static void main(String args[]) {
		int init = 1;
		
		BigInteger ans = new BigInteger("1");
		while (init < 51) {
			ans = ans.multiply(new BigInteger(Integer.toString(init)));
			System.out.println("seq"+ init +" : "+ ans);
			
			init++;
		}
	}
}
