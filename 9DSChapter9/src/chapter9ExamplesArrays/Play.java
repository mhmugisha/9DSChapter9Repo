package chapter9ExamplesArrays;

import java.util.Scanner;

public class Play {

 static Scanner console = new Scanner(System.in); 
 
	public static void main(String[] args) {
		
		int[] num = new int[5];
		int sum = 0;
		int average = 0;
		int i = 0;
		
		Scanner console = new Scanner(System.in);
		
		for (i = 0; i < num.length; i++)
		{
			System.out.println("Enter integer: " + (i + 1));
			num[i] = console.nextInt();
			sum = sum + num[i];
			average = sum/num.length;
		}
		
		System.out.println("The sum of the integers is: " + sum);
		System.out.println("The Average of the integers is " + average);
		
		//Outputs the array of the numbers entered.
		System.out.print("The Array entered: ");
		System.out.print("{" + num[0]);
		for ( i = 1; i < num.length; i++) 
		{
			System.out.print(", " + num[i]);
		}
		System.out.println("}"); 
	
	}

}
