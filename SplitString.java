package javaAssignment;

import java.util.Scanner;

public class SplitString {

	
	 public static void main(String[] args) {
		
		System.out.println("Enter A String");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		
		for(int i =0; i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				System.out.println();
				
			}
			System.out.print(s1.charAt(i));
		}
	
	 }
}
