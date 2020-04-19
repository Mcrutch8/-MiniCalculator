package unitTesting;
public class UnitTests extends Calculator {

	
	
	public static void main (String [] args) {
		
		MiniCalculator test = new MiniCalculator();
		test.multiply(5);
		
		System.out.println("test case 1 testing the multiply method with 5");
		System.out.println("expected output: 5");
		System.out.print("output: ");
		System.out.println(test.total);
		System.out.println("multiply method passed");
		System.out.println("test case 2 testing the multiply method with 10");
		
		test.multiply(10);
		
		System.out.println("expected output: 50");
		System.out.print("output: ");
		System.out.println(test.total);
		System.out.println("multiply method passed");
		
		
		test.divide(5);
		
		System.out.println("test case 1 testing the divide method with 50");
		System.out.println("expected output: 10");
		System.out.print("output: ");
		System.out.println(test.total);
		System.out.println("divide method passed");
		
		test.divide(10);
		System.out.println("test case 2 testing the divide method with 10");
		System.out.println("expected output: 1");
		System.out.print("output: ");
		System.out.println(test.total);
		System.out.println("divide method passed");
		
		
		int x = test.calculate(5);
		System.out.println("test case 1 testing the calculate method with 5");
		System.out.println(test.calculate(5));
		System.out.println("This proves that calculate is returning the int value");		
		
		
	}
	
}

