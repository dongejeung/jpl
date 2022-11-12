package chp1.quicktour;

class Exer1_5 {
	/** Print out the Fibonacci sequence for values < 50 */
	public static void main(String args[]) {
		int lo = 1;
		int hi = 1;

		int cnt = 1;
		System.out.println(lo);
		while (hi < 50) {
			System.out.println(cnt +"seq : "+ hi);
			hi = lo + hi;	// new hi
			lo = hi - lo;	/* new lo is (sum - old lo)
							   i.e., the old hi */
			cnt++;
		}
	}
}
/*
 *	Java built-in primitive data types
 *
 *	boolean either true or false
 *	char	16-bit Unicode 2.0 charactor
 *	byte	8-bit integer (signed)
 *	short	16-bit integer (signed)
 *	int		32-bit integer (signed)
 *	long	64-bit integer (signed)
 *	float	32-bit floating-point (IEEE 754-1985)
 *	double	62-bit floating-point (IEEE 754-1985)
 *
 */
