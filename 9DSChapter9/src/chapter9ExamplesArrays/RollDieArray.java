package chapter9ExamplesArrays;

import java.util.Scanner;

public class RollDieArray {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		RollDie[] dice = new RollDie[100];//Creates array dice of 100 elements and each element is a reference variable to an object of the class RollDie. 
		int[] rollCount = new int[6];//Creates and initializes array rollCount - to store the no. of times @ no. is rolled.
		int maxNumRolled = 0; //Which number (1-6), has been rolled most.   
	
		for(int i = 0; i < 100; i++)
		{	
			dice[i] = new RollDie();
			dice[i].roll();
		}//if this is not enclosed in {}, error on 2nd i variable.
		
		System.out.println("Numbers rolled: ");
		for(int i = 0; i < 100; i++)
		{
			int num = dice[i].getNum();
			
			System.out.print(" " + num);
			rollCount[num - 1]++;
			if((i + 1) % 34 ==0)
				System.out.println();
		}	
			System.out.println(); 
			System.out.println("Num Roll_Count"); 
		for (int i = 0; i < 6; i++) 
		{ 
		    System.out.println(" " + (i + 1) + " "+ rollCount[i]);
		 if (rollCount[i] > rollCount[maxNumRolled]) 
			maxNumRolled = i; 
		} 
		
			System.out.print("The number(s) "); 
		for (int i = 0; i < 6; i++) 
		if (rollCount[i] == rollCount[maxNumRolled]) 
			System.out.print((i + 1) + " "); 
			
		System.out.println("is (are) rolled maximum number of times, which is "
		+ rollCount[maxNumRolled] + "."); 
		}
	
	
}
