package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		int [] arr = {1, 2, 4, 5, 6, 7};
		Arrays.sort(arr);
		for (i = arr[i]; i< arr.length;i++) {
				if (i != arr[i-1]) {
					System.out.println("The missing number is " +i );
					break;
				}
		}
		
	}
	
}	
		
			
		
	

	


