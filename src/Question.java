/**
 * Isolde Alfaro
 * CS 356 : Object-Oriented Programming
 * A1: iVote Simulator
 * October 27th, 2016
 */
import java.util.ArrayList;

public interface Question {
	
	public boolean singleQuestion();

	public String getQuestion();
	
	public ArrayList<String> getResponse();
	
}