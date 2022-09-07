
// prime number

package test.codes;

import java.util.Scanner;

public class ToFindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to find its prime or not");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean prime = true;
		for(int i=2; i<number; i++)
		
		{
			
		if(number%i==0) {
			System.out.println("It is not a prime");
			prime = false;
			break;
		}	
		}
    if(prime == true)
    {
    	System.out.println("It is a prime");
    }
    
	}

}
