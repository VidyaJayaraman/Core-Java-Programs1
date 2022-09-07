package test.codes;

import java.util.Arrays;
import java.util.Scanner;

// string reverse and change reverse words in even position

// string contains only one word easily reversed by change it to charArray and print from length-1

// string contains multiple words, first split and then change it to string array and print from length-1

public class String_manipulations {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the given string");
		Scanner scanner = new Scanner(System.in);
		String test = scanner.nextLine();
		
	 // string reversal wrt to each character
		char[] charArray = test.toCharArray();
		int length = charArray.length;
	    System.out.println("Reversed String is ");
		for(int i=length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		// changing even index words to uppercase and print the string from reverse 
		String[] split = test.split(" ");
		for(int j=0; j<split.length; j++) {
			
			if(j%2 != 0) {	
				
				split[j] = split[j].toUpperCase();
				
			}
			else {
				split[j] = split[j];
			}
		
			
		}
		System.out.println(" ");
		System.out.println("Reversed string with Uppercase in even position words ");
		
		for(int k = split.length-1; k>=0; k--) {
			
			System.out.print(split[k] + " ");
		}
}
}