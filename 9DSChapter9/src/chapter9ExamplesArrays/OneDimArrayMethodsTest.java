
//NOTE: METHODS ARE BEING CALLED BY CLASS NAME OneDimArrayMethods because
//the methods are public static. 

package chapter9ExamplesArrays;

public class OneDimArrayMethodsTest {

	static final int ARRAY_SIZE = 2;
	
	public static void main(String[] args) {
		
		int[] listA = new int[ARRAY_SIZE];
		int[] listB = new int[ARRAY_SIZE];
		
//output default values of elements of listA using the method printArray 
		System.out.print("List A elements:");
		OneDimArrayMethods.printArray(listA, listA.length);     
		
	//input data into listA using the method fillArray	
	System.out.println("Enter " + listA.length + " integers");
	OneDimArrayMethods.fillArray(listA, listA.length);
   
	System.out.print("After filling listA, the elements are:"
			+ "\n ");

	//output the elements of listA
	OneDimArrayMethods.printArray(listA, listA.length);
     
	//find and output the sum of the elements of listA
	System.out.println("Sum of the elements: " + OneDimArrayMethods.sumArray(listA, listA.length));
	
	
	//find and output the position of the (first) largest element in listA
	System.out.println("Position of largest element in listA is: "
					+ OneDimArrayMethods.indexLargestElement
					(listA, listA.length));
	
	//find and output the largest element in listA
	System.out.println("Largest (1st) element in listA is: " 
						+ listA[OneDimArrayMethods.indexLargestElement
						        (listA, listA.length)]);
    
	//copy the elements of listA into listB using the method copyArray
	OneDimArrayMethods.copyArray(listA, 0, listB, 0,listA.length); 
	System.out.print("After copying the elements of listA into listB\n"
						+ "listB elements are: "); 
	
	//output the elements of listB
	OneDimArrayMethods.printArray(listB, listB.length); 
	System.out.println();
	}
}
