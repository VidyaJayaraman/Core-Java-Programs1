package test.codes;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String string1 = scanner.nextLine();
		
		System.out.println("Enter the second String");
		String string2 = scanner.nextLine();
		
		char[] charArray1 = string1.toCharArray();
		char[] charArray2 = string2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean notAnagram = true;
		
		if(charArray1.length!=charArray2.length)
		{
			System.out.println("String Length not equal.So Anagram check can not performed.");
		}
		
		else {
			
		for(int i=0; i<charArray1.length;i++) {
			if(charArray1[i]!=charArray2[i]) {
				System.out.println("Its not a anagram");
				notAnagram = false;
				break;
			}
		}
			 if(notAnagram == true) {
		     System.out.println("It is a anagram");
					
			}
		}
		
	}
		
}



