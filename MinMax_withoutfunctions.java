package test.codes;

import java.util.Scanner;

public class MinMax_withoutfunctions {

	public static void main(String[] args) {
		
		int[] num = new int[7];
		System.out.println("Enter seven number to find min and max amoing them");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int j=0; j<num.length; j++) {
			if(min>num[j]) {
				min = num[j];
			}
			if(max<num[j])
			{
				max = num[j];
			}
		}
		
		System.out.println("Min value " + min);
		System.out.println("Max value " + max);
	}
	

}
