package week1.day1;

import java.util.*;

public class Isprime {
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num==1 || num==2 || num==3 ) {
			System.out.println(" It is a prime number");
		}
		else if((num+1)% 6 == 0 || (num-1) % 6 == 0) {
			System.out.println(" It is a prime number");
		}
			else {
				System.out.println(" It is not a prime number");
				
		}
		
		
	}
 
}
