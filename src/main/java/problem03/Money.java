package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		return new Money(amount + money.amount);
	}

	public Money minus(Money money) {
		return new Money(amount - money.amount);
	}

	public Money multiply(Money money) {
		return new Money(amount * money.amount);
	}

	public Money devide(Money money) {
		return new Money(amount / money.amount);
	}
	
	public boolean equals(Money money) {
		if (amount == money.amount) {
			return true;
		} else {
			return false;
		}
	}
}