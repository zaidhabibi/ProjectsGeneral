/**
 * StudentGrade class
 * Contains the definition for a class to hold a student name
 * and multiple grades.  The class provides methods for toString,
 * equals, and get/set for the attributes.  
 * Created 10/04/2020
 * @author Zaid Habibi COSC-1437.202 
 */

public class StudentGrade {

	private String name;
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midTerm;
	private double finalExam;

	//TODO: declare remaining attributes
	
	private double computeAverage()
	{
		//TODO: Calculate in a simpler way
		// If I was a strict grader, I would take points for this function because it would be better to use constants and less variables
		double quizOnePercentage = (getQuiz1() / 5);
		double quizTwoPercentage = (getQuiz2() / 5);
		double quizThreePercentage = (getQuiz3() / 5);
		double weightedQuizAverage =(((quizOnePercentage + quizTwoPercentage + quizThreePercentage) / 3) * 0.25);
		double weightedMidTermDecimal = (getMidTerm() / 100) * (0.35);
		double weightedFinalExamDecimal = (getFinalExam() /  100) * (0.40); 

        return (weightedQuizAverage + weightedFinalExamDecimal +weightedMidTermDecimal) * (100);
		
	}
	
	//TODO: no-argument constructor
		StudentGrade(){

		}
	
	//TODO: constructor with a parameter for the name
	//TODO: Rearrange methods to make more sense
	
		StudentGrade(String studentName){
			name = studentName; 
		}
		
	/** 
	 * toString
	 * This method overrides the Object class' toString method
	 * @return the student information as a string.  All attributes are
	 * included, plus a call to the computeAverage() method for determining
	 * class average.
	 */
	
	public String toString()
	{   
        //TODO: If I was a strict grader, I would take off points for not just formatting this string
        return "Name: " + getName() + "\nQuiz 1: " + getQuiz1() + " \tQuiz 2: " + getQuiz2() + " \tQuiz 3: " + getQuiz3() + "\nMid-term Exam: " + getMidTerm() + "\nFinal Exam: " + getFinalExam() + "\nutubeClass Average: " + computeAverage(); 

	}
	
	/** 
	 * equals
	 * This method overrides the Object class' equals method
	 * @param 	account2	the account to which to compare this one
	 * @return 	true if account name and balance are the same between this account
	 * 			and the passed in account.  false otherwise.
	 */
	
	public boolean equals(StudentGrade student2)
	{
		return this.getName().equals(student2.getName());
	}

	/**
	 * getName
	 * @return	name	the student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param	n	the value to set our student name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * getQuiz1
	 * @return	quiz1	the first quiz score
	 */
	public double getQuiz1() {
		return quiz1;
	}

    public double getQuiz2() {
		return quiz2;
    }
    
    public double getQuiz3() {
		return quiz3;
    }
    
    public double getMidTerm() {
		return midTerm;
    }
    
    public double getFinalExam() {
		return finalExam;
    }
    
    
	/**
	 * setQuiz1
	 * @param	q1	the value to set our first quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz1(double q1) {
		boolean retVal = false;
		if (q1 >=0 && q1 <=5)
		{
			quiz1 = q1;
			retVal = true;
		}
		return retVal;
	}

	/**
	 * setQuiz2
	 * @param	q2	the value to set our second quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz2(double q2) {
		boolean retVal = false;
		if (q2 >=0 && q2 <=5)
		{
			quiz2 = q2;
			retVal = true;
		}
        return retVal;
    
	}
	
	/**
	 * setQuiz3
	 * @param	q3	the value to set our third quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz3(double q3) {
		boolean retVal = false;
		if (q3 >=0 && q3 <=5)
		{
			quiz3 = q3;
			retVal = true;
		}
		return retVal;
	}

	public boolean setMidTerm(double mt){
		boolean retVal = false;
		if (mt <= 100 && mt >= 0){
			midTerm = mt;
			retVal = true;
		}
		return retVal; 
	}

	public boolean setFinal(double fe){
		boolean retVal = false;
		if (fe <= 100 && fe >= 0){
			finalExam = fe;
			retVal = true;
		}
		return retVal; 
	}

	
	//TODO: complete remaining get/set methods


	
	
	
	
	
	
	
}
