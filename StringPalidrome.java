package javaAssignment;

import java.util.Scanner;

public class StringPalidrome {
	 public static void main(String[] args) {
		 boolean flag = true;
		System.out.println("Enter A String");
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println(s1);
		 String s2=s1;
		 for (int i=0;i<s1.length()/2;i++)
		 {
			 if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
			 {
				 flag= false;
				 break;
			 }
		 }
		if(flag)
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not Palindrome");
		
	  
		}
}


