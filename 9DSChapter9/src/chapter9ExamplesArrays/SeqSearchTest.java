package chapter9ExamplesArrays;

import java.util.Scanner;

public class SeqSearchTest {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int[] intList = new int[10];
		int number;
		int index;

		System.out.println("Enter " + intList.length + " integers.");
		
		for(index = 0; index < intList.length; index++)
		intList[index] = console.nextInt();
		
		System.out.println();
		
		System.out.println("Enter No. to be searched.");
		number = console.nextInt();
		
		index = OneDimArrayMethods.seqSearch(intList, intList.length, number);
		
		if (index != -1)
			System.out.println(number + " is found at position " + index +".");
		else
			System.out.println(number + " is not in the list.");
	}

}
