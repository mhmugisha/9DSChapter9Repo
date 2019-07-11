//Example 9-10 - 5th Edition of Java Programming from Problem Analysis to
//Program Design - page 583.

//Example demonstrates how one method "largest" can be invoked on lists with 
//variable length parameters.


package chapter9ExamplesArrays;

public class LargestNumber {

	public static void main(String[] args) {
		double[] numberList = { 23, 45.5, 89, 34, 92.78, 36, 90, 120.89, 97, 23, 90, 89 };
		System.out.println("The larger of 5.6 and 10.8 is " + largest(5.6, 10.8));
		System.out.println("The largest of 23,78, and 56 is " + largest(23, 78, 56));
		System.out.println("The largest of 93, " + "28, 83, and 66 is " + largest(93, 28, 83, 66)); 
		System.out.println("The largest of 22.5, 12.34, 56.34, 78, " + "\n "
				+ "98.45, 25, 78, 23 and 36 is " + largest(22.5, 12.34, 56.34, 78, 98.45, 25, 78, 23, 36));  
		System.out.println("The largest " + "number in numList is " + largest(numberList)); 
		System.out.println("A call to the method " + "largest with an empty \n" + " parameter "
				+ "list returns the value " + largest());

	}
/*___________________________________________________________________*/
	//Method largest - to return largest element of the given list.
	//Note the syntax of the formal parameter: type...identifier
	//The identifier can be anything we could have put bag in the place of 
	//numList.
	public static double largest(double...numList) {
		double max;
		if (numList.length != 0) {
			max = numList[0];
			for (int index = 1; index < numList.length; index++) {
				if (max < numList[index])
					max = numList[index];
			}
			return max;
		}
		return 0.0;
	}
}
