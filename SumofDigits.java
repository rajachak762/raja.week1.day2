package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		
		int number = 698;
		int sum = 0;
		
		while (number > 0) {
			int rem = number % 10;
			number = number/10;
			sum = sum + rem;
		}
		
		System.out.println("The summation of the digits of the number is " +sum);

	}


}

