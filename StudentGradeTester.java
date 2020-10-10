/**
 * StudentGradeTester class
 * Contains the code to test the methods of the StudentGrade class
 * Creates an instance of a StudentGrade, fills it with data, and displays
 * all information to the screen.  
 * Created 10/04/2020
 * @author Zaid Habibi COSC-1437.202 
 */

import java.util.Scanner;

public class StudentGradeTester {
	public static void main(String[] args) {
		String name1 = "";
		Scanner kbd = new Scanner(System.in);
		double kbdInput = 0;

		
		System.out.println("Welcome to the Student Grades Program");
		System.out.print("Enter the name for the student: ");
		name1 = kbd.nextLine();
		
		//create an instance of StudentGrade, passing in the name given above
		StudentGrade s1 = new StudentGrade();
		
		//prints out all current information about the student - their name and default
		//values of 0 for all scores and average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);
		
		System.out.println("Please enter the following information for " + s1.getName());
	
		//TODO: complete the code to ask for quiz scores 1-3, the midterm exam, and the final exam

		// Ask the user to enter quiz1 and call a method to set it up in the object
		//TODO: Figure out how to use less quiz and final variables here
		do {
			System.out.print("Quiz 1: ");
			kbdInput = kbd.nextDouble();
			if (!s1.setQuiz1(kbdInput)){
				System.out.println("Please enter a number between 1 and 5");
			}
		  } while (!s1.setQuiz1(kbdInput));
		  


		  do {
			System.out.print("Quiz 2: ");
			kbdInput = kbd.nextDouble();
			if (!s1.setQuiz2(kbdInput)){
				System.out.println("Please enter a number between 1 and 5");
			}
		  } while (!s1.setQuiz2(kbdInput));


		  do {
			System.out.print("Quiz 3: ");
			kbdInput = kbd.nextDouble();
			if (!s1.setQuiz3(kbdInput)){
				System.out.println("Please enter a number between 1 and 5");
			}
		  } while (!s1.setQuiz3(kbdInput));



		do {

			System.out.print("Mid-term: ");
			kbdInput = kbd.nextDouble();

			if (!s1.setMidTerm(kbdInput)){
				System.out.println("Please enter a number between 0 and 100");
			}
		  } while (!s1.setMidTerm(kbdInput));

		  do {

			System.out.print("Final Exam: ");
			kbdInput = kbd.nextDouble();

			if (!s1.setFinal(kbdInput)){
				System.out.println("Please enter a number between 0 and 100");
			}
		  } while (!s1.setFinal(kbdInput));
	  
		  
	
		//prints out all current information about the student, including average
		System.out.println("Here is the current data for this student: ");
		System.out.println(s1);


		
	}

}
