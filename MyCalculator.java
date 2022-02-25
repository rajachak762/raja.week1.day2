package week1.day1;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		double div = calc.div(20, 10);
		int sum = calc.sum(10, 5, 8);
		float mul = (float) calc.mul(10.5, 2.8);
		int sub = calc.sub(178, 123);
		System.out.println("The summation result is "  +sum);
		System.out.println("The subtraction result is "  +sub);
		System.out.println("The multiplication result is " +mul);
		System.out.println("The division result is " +div);
	}

}
