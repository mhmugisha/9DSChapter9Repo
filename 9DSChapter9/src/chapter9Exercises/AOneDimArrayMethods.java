
//Class for one dimensional array methods. 


package chapter9Exercises;

import java.util.Scanner;

public class AOneDimArrayMethods {

		//Method to input data and store in an int array.
		//The array to store the data and its size are passed as
		//parameters. The parameter numOfElements specifies the
		//number of elements to be read.
	public static void fillArray(double list[], int numOfElements) 
	{
	   Scanner console = new Scanner(System.in);
		
	   for(int index = 0; index < numOfElements; index++)
		   list[index] = console.nextInt();
	}
/*__________________________________________________________________*/	
	//Method to print the elements of an int array.
	//The array to be printed and the number of elements are
	//passed as parameters. The parameter numOfElements
	//specifies the number of elements to be printed.
	
	public static void printArray(int list[], int numOfElements) 
	{
		for(int index = 0; index < numOfElements; index++)
			System.out.println(list[index] + " ");
	}
/*___________________________________________________________________*/	
	//Method to find and return the sum of the elements of an
	//int array. The parameter numOfElements specifies the
	//number of elements to be added.	
	
	public static double sumArray(double list[], int numOfElements) 
	{
		double sum = 0;
		for (int index = 0; index < numOfElements; index++)
		sum = sum + list[index];

		return sum;
	}
/*____________________________________________________________________*/	
	
	//Method to find and return the index of the first occurrence
	//of the largest element, if it repeats, in an int array.
	//The parameter numOfElements specifies the number of
	//elements in the array.
	
	public static int indexLargestElement(int list[], int numberOfElements)
	{
		
		int maxIndex = 0; //Assume first element is the largest.
		for (int index = 1; index < numberOfElements; index++)
			if (list[maxIndex] < list[index])//list[index] element at 
				maxIndex = index;			 //index in list.	
		
		return maxIndex;
	}
/*____________________________________________________________________*/	
	
	//Method to copy some or all the elements of one array
	//into another array. Starting at the position specified
	//by source (src), the elements of list1 are copied into list2
	//starting at the position specified by target (tar). The parameter
	//numOfElements specifies the number of elements of list1 to
	//be copied into list2. Starting at the position specified
	//by tar, list2 must have enough components to copy the
	//elements of list1. The following call copies all the
	//elements of list1 into the corresponding positions in
	//list2: copyArray(list1, 0, list2, 0, numOfElements);.
	
	public static void copyArray(int[] list1, int src, int[] list2,
			int tar, int numOfElements) 
	{
		for (int index = src; index < src + numOfElements; index++)
		{
		list2[index] = list1[tar];
		tar++;
		}
	}
/*____________________________________________________________________*/	
	
	//Another way to copy arrays.
	// To copy a int b, 	
	//	double[] b = new double[a.length];
	//		for (int i = 0; i < a.length; i++) {
	//			b[i] = a[i];
	//		}
	/*Another option is to use java.util.Arrays, which provides a method named
	  copyOf that copies an array. You can invoke it like this:
	
		double[] b = Arrays.copyOf(a, a.length);
	
	The second parameter is the number of elements you want to copy, so you can
	also use copyOf to copy just part of an array.*/
/*__________________________________________________________________*/	
	
	public static int seqSearch(int[] list, int listLength, int searchItem)
		{
			int loc;
			boolean found = false;
			loc = 0;
			
			while (loc < listLength && !found)
			if (list[loc] == searchItem)
				found = true;
			else
				loc++;

			if (found)
				return loc;
			else
					return -1;
		}

/*___________________________________________________________________*/

	//Method to search an array. Returns the position of target element.
	public static int search(double[] a, double target) {
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] == target) 
			{
					return i;
				}
			}
				return -1;
			}
   /*__________________________________________________________________*/

	//MY OWN METHODS: 
	//Method to return the smallest entry in a one dimensional array:
	//Gets index of smallest element and then returns the element itself.
	
	public static double smallestElement(double[] list, int numberOfElements) 
	
	{
	int minIndex = 0; //Assume index for smallest element is 0.
	for(int index = 1; index < numberOfElements; index++)
		{
			if(list[minIndex] > list[index])
			minIndex = index;
		}
			return list[minIndex];
	}
/*_____________________________________________________________________*/
	
	//Method to return the largest entry in a one dimensional array:
	//Gets index of largest element and then returns the element itself.
		
		public static double largestElement(double[] list, int numberOfElements) 
		
		{
		int maxIndex = 0; //Assume index for largest element is 0.
		for(int index = 1; index < numberOfElements; index++)
			{
				if(list[maxIndex] < list[index])
				maxIndex = index;
			}
				return list[maxIndex];
		}
/*_____________________________________________________________________*/
	
}



