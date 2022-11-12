package chp1.quicktour;

public class Exer1_8 {
	public static void main(String args[]) {
		int lo = 1;
		int hi = 1;
		
		int[] fibo_arr = new int[26];
		fibo_arr[0] = lo;
		fibo_arr[1] = hi;
		for(int i=2; i < fibo_arr.length; i++) {
			hi = lo + hi;
			lo = hi - lo;
			
			fibo_arr[i] = hi;
		}
		
		for(int i=0; i < fibo_arr.length; i++) {
			System.out.println(fibo_arr[i]);
		}
	}
}
