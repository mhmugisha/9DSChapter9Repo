
//We are using NUMBER_OF_ELEMENTS not simply size because an array
//can have filled up number of elements less than the declared size
//of an array. So we take only the filled up ones as they are the
//only valid ones. Note for most arrays the two are the same. 

package chapter9Exercises;

import java.util.Scanner;

public class No2SmallestIndexTest {

	public static final int NUMBER_OF_ELEMENTS = 5;
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] scores = new int[NUMBER_OF_ELEMENTS];
		
		int index = 0;
		for (index = 0; index < NUMBER_OF_ELEMENTS; index++)
		{
			System.out.println("Enter score: " + index);
			scores[index] = console.nextInt();
		}

		System.out.println("Index for smallest entry: " + No2SmallestIndex.smallestIndex(scores, NUMBER_OF_ELEMENTS));
		
	}

}
