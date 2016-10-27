/**
 * Isolde Alfaro
 * CS 356 : Object-Oriented Programming
 * A1: iVote Simulator
 * October 27th, 2016
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		
		//Single Choice Question
		String singleQuestion = "Are you graduating this Spring?";
		ArrayList<String> singleResponse = new ArrayList<String>();
		singleResponse.add("Yeah!");
		singleResponse.add("Nah");
		Question sqc = new SingleChoiceQuestion(singleQuestion, singleResponse);
		
		
		//Multiple Choice Question
		String multipleQuestion = "Which first five letters of the alphabet do you like the most?";
		ArrayList<String> multipleResponse = new ArrayList<String>();
		multipleResponse.add("A");
		multipleResponse.add("B");
		multipleResponse.add("C");
		multipleResponse.add("D");
		multipleResponse.add("E");
		Question mqc = new MultipleChoiceQuestion(multipleQuestion, multipleResponse);
		
		
		//Asking user to pick single/multiple choice questions and number of students
		Scanner k = new Scanner(System.in);
		System.out.println("Enter '0' for single choice questions and '1' for multiple choice questions: ");
		int userChoice = k.nextInt();
		
		Question questionType[] = new Question[2];
		Question questionChoice;
		questionType[0] = sqc; 
		questionType[1] = mqc;
		questionChoice = questionType[userChoice];		
		
		System.out.println("How many students do you want polled?: ");
		int studentSize = k.nextInt();
		Student student[] = new Student[studentSize];
		
		for (int i = 0; i < studentSize; i++)
		{
			student[i] = new Student(i);
		}
		
		System.out.println("\nQuestion: " + questionChoice.getQuestion());
		
		
		//Each student student displays at least one result
		System.out.println("\nResults: ");

		for (int i = 0; i < studentSize; i++)
		{
			student[i].sendResponse(questionChoice);
			System.out.println("Student " + student[i].getId() + " responded: " + student[i].getResponse());
		}
		
		//Randomly chooses which students submit multiple answers
		//Total number of responses is double the number of students in the poll
		
		int randomID;
		
		for (int i = 0; i < studentSize; i++)
		{
			randomID = (int)(new Random().nextInt(studentSize));
			student[randomID].sendResponse(questionChoice);
			System.out.println("Student " + student[randomID].getId() + " responded: " + student[randomID].getResponse());
		}
		
		
		//Initializes iVote
		IVoteService iVote = new IVoteService();

		System.out.println("\nTotal results:");
		iVote.displayTotals();
		
	}
}