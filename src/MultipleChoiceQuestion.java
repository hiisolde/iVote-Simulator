/**
 * Isolde Alfaro
 * CS 356 : Object-Oriented Programming
 * A1: iVote Simulator
 * October 27th, 2016
 */
import java.util.ArrayList;

public class MultipleChoiceQuestion implements Question {

	
	private String question;
	private ArrayList<String> response;
	
	public MultipleChoiceQuestion(String question, ArrayList<String> response)
	{
		this.question = question;
		this.response = response;
	}
	
	public boolean singleQuestion() {
		return false;
	}
	
	public String getQuestion() {
		return this.question;
	}

	public ArrayList<String> getResponse() {
		return this.response;
	}	
}