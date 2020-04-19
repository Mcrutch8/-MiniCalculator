package unitTesting;

public abstract class Calculator implements Multiplier, Divider {
	protected int total;
	Calculator() {
		total = 1;
	}

	public void multiply(int y) {
		total = total * y;
	}
	
	public void divide(int y) {
		total = total / y;
	}
	public int calculate(int a) {
		return a;
	}
	
}
