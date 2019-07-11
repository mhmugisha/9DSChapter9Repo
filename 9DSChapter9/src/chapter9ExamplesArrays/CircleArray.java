
// Program to create an array of circles.


package chapter9ExamplesArrays;

import java.util.Scanner;

public class CircleArray {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[5];
		
		double radius;
		
		for (int i = 0; i < 5; i++)
		{
		System.out.println("Enter radius of circle " + (i +1) + ":");
		radius = console.nextDouble();
		circles[i] = new Circle(radius);//For each i, a new Circle object 
		System.out.println();//is created and radius is passed to it as  			
		}   //a parameter. All the methods of Circle are called within the	
			// toString Method to output: radius, area and perimeter. 
		
   //After entering radii, this code generates the array of circles
		for (int i = 0; i < 5; i++) 
        System.out.println("Circle " +(i + 1)+ ": "+ circles[i]);
	}
}
/*Note: that in the class Circle, the toString method returns
the radius, perimeter, and area of a circle. And this is so because the 
object "circles" created in this program is of class or type Circle.
*/