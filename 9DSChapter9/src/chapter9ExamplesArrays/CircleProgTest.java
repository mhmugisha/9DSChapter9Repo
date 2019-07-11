//This example is on page 453-4 of: DS Malik



package chapter9ExamplesArrays;

import java.util.Scanner;

public class CircleProgTest {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circle firstCircle = new Circle(); 
		Circle secondCircle = new Circle(12); 
		
		double radius; 
		
		System.out.println("Line 10: firstCircle: " + firstCircle); // Output of this 
		//line and next will be radius, perimeter, area effected by the toString method  
		
		System.out.println("Line 11: secondCircle: " + secondCircle); 
		
		System.out.print("Line 12: Enter the radius: "); 
		radius = console.nextDouble(); 
		System.out.println(); 

		firstCircle.setRadius(radius); 
		System.out.println("Line 16: firstCircle: " + firstCircle );
		
		if (firstCircle.getRadius() > secondCircle.getRadius()) 
		System.out.println("Line 18: The radius of the first circle is greater than"
							+ "the radius of the second circle. "); 
		
		else if (firstCircle.getRadius() < secondCircle.getRadius()) 
		System.out.println("Line 20: The radius of the first circle is less than the "
							+ "radius of the second circle. "); 
		
		else 
		System.out.println("Line 22: The radii of both circles are the same."); 
		}//end main
		
		

}
