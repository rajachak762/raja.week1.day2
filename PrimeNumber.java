package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare an int Input and assign a value 13
		int number = 2;
		boolean flag = false;
		
		for(int i = 2; i<= number/2; i++) {
			if (number % i == 0)
			{
				flag = true;
				break;
			}	
	}
		
		if(flag == false) {
			System.out.println("The given number " +number+ " is prime");
		}	
		else {
			System.out.println( "The given number "+number+ " is not prime");	
		}	

	}

	

}

