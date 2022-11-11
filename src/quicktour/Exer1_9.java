package quicktour;

public class Exer1_9 {
	public static void main(String args[]) {
		int lo = 1;
		int hi = 1;
		
		Fibo[] fiboArr = new Fibo[26];
		fiboArr[0] = new Fibo(1, false);
		fiboArr[1] = new Fibo(1, false);
		
	for (int i = 2; i < fiboArr.length; i++) {
		hi = fiboArr[i-2].getValue() + fiboArr[i-1].getValue();
		lo = hi - fiboArr[i-2].getValue();
		
		boolean isEven = false;
		if(hi%2 == 0) isEven = true;
			
		fiboArr[i] = new Fibo(hi, isEven);
	}
		
	for (int i = 0; i < fiboArr.length; i++) {
		System.out.println("num : " +fiboArr[i].getValue()+ " | isEven : " +fiboArr[i].getIsEven());
	}
	
	}
}

class Fibo {
	private int value;
	private boolean isEven;
	
	Fibo(int value, boolean isEven) {
		this.value = value;
		this.isEven = isEven;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean getIsEven() {
		return isEven;
	}

	public void setIsEven(boolean isEven) {
		this.isEven = isEven;
	}
	
}