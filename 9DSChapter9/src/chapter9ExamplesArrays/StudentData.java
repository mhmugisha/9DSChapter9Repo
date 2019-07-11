//Example 9-12. DS Malik 5th Edition.


package chapter9ExamplesArrays;

public class StudentData {

	private String firstName;
	private String lastName;
	private double[] testScores; // array to store
	// the test scores
	private char grade;

	// Default constructor
	public StudentData() {
		firstName = "";
		lastName = "";
		grade = '*';
		testScores = new double[5];
	}

	// Constructor with parameters
	// The parameter list is of varying length.
	// Postcondition: firstName = fName; lastName = lName;
	// testScores = list;
	// Calculate and assign the grade to
	// grade.
	public StudentData(String fName, String lName, double... list) {
		firstName = fName;
		lastName = lName;
		testScores = list;
		grade = courseGrade(list); // calculate and store
		// the grade in grade
	}

	// Method to calculate the grade
	// Postcondition: The grade is calculated and
	// returned.
	public char courseGrade(double... list) {
		double sum = 0;
		double average = 0;
		for (double num : list)
			sum = sum + num; // sum the test scores
		if (list.length != 0) // find the average
			average = sum / list.length;
		if (average >= 90) // determine the grade
			return 'A';
		else if (average >= 80)
			return 'B';
		else if (average > 70)
			return 'C';
		else if (average > 60)
			return 'D';
		else
			return 'F';
	}

	// Method to return student's name, test scores,
	// and grades as a string.
	// Postcondition: The string consisting of the first
	// name, last name, followed by the
	// test scores, and the course grade is
	// constructed and returned.
	public String toString() {
		String str;
		str = String.format("%-10s %-10s ", firstName, lastName);
		for (double score : testScores)
			str = str + String.format("%7.2f", score);
		str = str + " " + grade;
		return str;
	}

}
