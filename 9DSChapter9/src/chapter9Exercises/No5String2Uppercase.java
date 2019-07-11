package chapter9Exercises;

import java.util.Scanner;

public class No5String2Uppercase {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
	char[] uganda = new char[6];
	
	 int i;
	for(i = 0; i < uganda.length; i++) 
		{
		System.out.println("Enter String:");
	    uganda[i] = console.next().charAt(0);
		}
	
	for(i = 0; i < uganda.length; i++) 
	{
		System.out.print(uganda[i]);  
	}
	
	}
	
}
