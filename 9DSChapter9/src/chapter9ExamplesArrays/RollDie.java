package chapter9ExamplesArrays;

public class RollDie {
	
	private int num;
		//Default constructor
		//Sets the default number rolled by a die to 1
	RollDie()
		{
			num = 1;
		}
/*____________________________________________________________*/
	//Method to roll a die.
	//This method uses a random number generator to randomly
	//generate a number between 1 and 6, and stores the number
	//in the instance variable num and returns the number.
	public int roll()
	{
	num = (int) (Math.random() * 6) + 1;
	  return num;
	}
/*______________________________________________________________*/	
	//Method to return the number on the top face of the die.
	//Returns the value of the instance variable num.
	
	public int getNum()
	{
	   return num;
	}
		//Returns the value of the instance variable num as a string.
/*_______________________________________________________________*/	
	
	public String toString()
	{
		return "" + num;
	}
	
}
/*________________________________________________________________*/