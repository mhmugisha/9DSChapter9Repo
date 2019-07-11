/*Write a Java method, smallestIndex, that takes as its parameters an int
array and its size, and returns the index of the (first occurrence of the)
smallest element in the array. Also, write a program to test your method.*/



/*We assume that minIndex will contain the index of the smallest 
 * element in the array scores. The general algorithm is as follows. 
 * Initially, we assume that the first element in the array is the 
 * smallest element, so minIndex is initialized to 0. We then 
 * compare the element to which minIndex points with every element 
 * in the array. Whenever we find an element in the array smaller 
 * than the element to which maxIndex points, we update minIndex 
 * so that it stores the index of the new smaller element.*/

package chapter9Exercises;

public class No2SmallestIndex {

	
	public static int smallestIndex(int[] list, int numberOfElements) 
	{
	int minIndex = 0; //Assume index for smallest element is 0.
		for(int index = 1; index < numberOfElements; index++)
		{
			if(list[minIndex] > list[index])
				minIndex = index;
		}
		return minIndex;
		
		
	}
}
