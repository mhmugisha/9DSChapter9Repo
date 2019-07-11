package chapter9Exercises;

public class No1FiftyElementsArray {

	public static void main(String[] args) {
		
		double[] alpha = new double[50];
		
		int i = 0;
		for(i = 1; i < 25; i++)
		{
			alpha[i] = i*i;
		System.out.print(alpha[i] + " ");
		}
		for(i = 25; i < 50; i++)
		{
			alpha[i] = 3 * i;
		System.out.print(alpha[i] + " ");
		}
		
	}

}
