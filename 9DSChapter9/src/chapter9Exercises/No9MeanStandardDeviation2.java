package chapter9Exercises;

public class No9MeanStandardDeviation2 {

	public static final int SIZE = 101;
	
	public static void main(String[] args) {
		
		double[] numbers = new double[SIZE];
	
/*___________________________________________________________________*/
//Loop to fill/populate the array. Note that the elements of this array 
//are 1,2,3,...,100.
		
		for(int i = 1; i < SIZE; i++)
		{
			numbers[i] = i;
		}
/*__________________________________________________________________*/		
//Alternative way: Invoking method fillArray from AOneDimArrayMethods class 
//		System.out.println("Enter Array numbers elements:");
//		AOneDimArrayMethods.fillArray(numbers, SIZE);
/*___________________________________________________________________*/
//Invoking the calculate SD method.
		double SD = calculateSD(numbers);
		System.out.printf("Standard Deviation = %.6f", SD);
	}
	
/*__________________________________________________________________*/	
//Method to calculate the Standard Deviation SD.	
	public static double calculateSD(double numbers[])
    {
        double sum = 0.0, squareSum = 0.0;
        
        for(double num : numbers) 
        {
            sum += num;
        }

        double mean = sum/SIZE;

        for(double num: numbers) {
        	squareSum = squareSum + Math.pow(num - mean, 2);
        }

        return Math.sqrt(squareSum/SIZE);
    }
} 


 