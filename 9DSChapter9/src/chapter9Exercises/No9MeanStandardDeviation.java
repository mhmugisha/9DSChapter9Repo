package chapter9Exercises;

import java.util.Scanner;

public class No9MeanStandardDeviation {

	public static final int SIZE = 3;
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[] numbers = new double[SIZE];
	
/*___________________________________________________________________*/
	//Loop to fill the array.	
		for(int i = 0; i < SIZE; i++)
		{
			System.out.println("Enter element: " + (i+1));
			numbers[i] = console.nextInt();
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


 