package chapter9Exercises;

import java.util.Scanner;

public class No4JudgeScores {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		double[] scores = new double[8];
		
		int size = 8;
		double total = 0.0;
		double subtotal = 0.0;
		int i;
		for(i = 0; i < 8; i++)
		{
			System.out.println("Enter score for judge " + (i +1) + ":");
			scores[i] = console.nextDouble();
		} //Challenge - put condition to reject entry < 0, or > 10.
		System.out.println("Smallest score: " + 
				AOneDimArrayMethods.smallestElement(scores, size));
		System.out.println();
		
		
		System.out.println("Largest score: " + 
				AOneDimArrayMethods.largestElement(scores, size));
		System.out.println();
		
		total = AOneDimArrayMethods.sumArray(scores, size);
		subtotal = AOneDimArrayMethods.smallestElement(scores, size)+
				AOneDimArrayMethods.largestElement(scores, size);
		
		System.out.println("Points scored:" + (total - subtotal));
	}

}
