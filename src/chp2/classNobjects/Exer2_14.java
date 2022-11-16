package chp2.classNobjects;

import java.util.LinkedList;
import java.util.Queue;

// BankAccount class
public class Exer2_14 {
	private long number; // account number
	private long balance; // current balance
	private Action lastAct;
	private History history;
	
	public static class Permissions {
		public boolean canDeposit,
					   canWithdraw,
					   canClose;
	}
	
	// nested clss
	public class Action {
		private String act;
		private long amount;
		
		Action(String act, long amount) {
			this.act = act; // 여기서의 this 는 Action classs 의 this.
			this.amount = amount;
		}
		
		public String toString() {
			return number + ": " + act + " " + amount;
		}
	}
	
	public void deposit(long amount) {
		balance += amount;
		lastAct = new Action("deposit", amount);
		this.history.bookHistory(lastAct);
	}
	
	public void withdraw(long amount) {
		balance -= amount;
		lastAct = new Action("withdraw", amount);
		this.history.bookHistory(lastAct);
	}
	
	/*
	 * nested class 가 필수는 아닌 것 같지만, 개념적으로도 BankAccount 에 속해있고,
	 * 기존 ACtion 클래스를 사용하는 것도 그렇고 nested 가 되는 게 괜찮다고 생각함.
	 * non static 이 되야 한다고 생각. 여러 Account의 history 가 각각 존재.
	 * 
	 * FIFO LIFO 등에 대한 고려 필요.
	 * Data type 에 대한 고민 필요.
	 * 
	 */
	public class History {
//		private Queue<Action> history;
		private LinkedList<Action> history;
		private int currIdx = 0; 
		private final int MAX_SIZE = 10;
		
		public void bookHistory(Action a) {
			if(history.size() == MAX_SIZE) history.removeFirst();
			history.addLast(a);
		}
		
		// LinkedList 의 Idx 기반으로 next() 구현.
		// last 이후에 행위에 대한 고려는 요구사항에 안보여서 일단 배제.
		public Action next() {
			Action ans = history.get(currIdx);
			if(currIdx < 9)	this.currIdx++;
			else ans = null;
			return ans;
		}
		
		/*
		public History history() {
			return Exer2_14.this.history; // enclosing object 의 this 에 접근.
		}
		*/
	}
	
	// History.hitory 가 어감이 이상해서, BankAcount.history 가 나을 것 같음.
	public History history() {
		return this.history;
	}
	
}
