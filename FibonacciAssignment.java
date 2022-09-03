package week1.day1;


import java.util.*;
public class FibonacciAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of value to print fibonacci series");
        Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + "," + b + ",");
		for(int i=3; i<=num; i++) {
			
			int c = a+b;
			a = b;
			b = c;
			System.out.print(c + ",");
			
		}
		
	
	}

}
