package quicktour;

class Exer1_11 {
	/** Print out the Fibonacci sequence for values < 26 */
	public static void main(String args[]) {
		int lo = 1;
		int hi = 1;

		String[] fiboStrArr = new String[26];
		
		fiboStrArr[0] = "1";
		fiboStrArr[1] = "1";
		for (int i = 2; i < fiboStrArr.length; i++) {
			hi = lo + hi;	
			lo = hi - lo;	
			
			fiboStrArr[i] = Integer.toString(hi);
		}
		
		for (int i = 0; i < fiboStrArr.length; i++) {
			System.out.println(fiboStrArr[i]);
		}
	}
}
