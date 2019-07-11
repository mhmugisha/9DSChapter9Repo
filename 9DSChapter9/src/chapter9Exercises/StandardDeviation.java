package chapter9Exercises;

import java.util.Scanner;

public class StandardDeviation {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		double[] numArray = {90,91,92,93,94,95,96,97,98,99};
        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, squareSum = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
        	squareSum = squareSum + Math.pow(num - mean, 2);
        }

        return Math.sqrt(squareSum/length);

		
	}

}
