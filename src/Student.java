/**
 * Isolde Alfaro
 * CS 356 : Object-Oriented Programming
 * A1: iVote Simulator
 * October 27th, 2016
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;

public class Student {

	private int ID;
	private ArrayList<String> response;
	private static HashMap<Integer, ArrayList<String>> mapResponse = new HashMap<Integer, ArrayList<String>>();
	
	public Student(int id) {
		this.ID = id;
	}
	
	public int getId() {
		return ID + 1;
	}
	
	public void sendResponse(Question question) {
		if (question.singleQuestion()) {
			//For single responses, this shuffles the array list, then deletes the 0 index
			response = new ArrayList<String>(question.getResponse());
			Collections.shuffle(response);
			response.remove(0);
			mapResponse.put(getId(), response);
			
		} else {
			//For multiple responses, this shuffles the array list then deletes a random amount of indexes
			response = new ArrayList<String>(question.getResponse());
			Collections.shuffle(response);
			
			int removeRandom;
			removeRandom = (int)(new Random().nextInt(response.size()) - 1);
			
			for (int i = 0; i < removeRandom; i++) {
				response.remove(i);
			}
			
			for (int j = 0; j < response.size(); ++j) {
				if (response.get(j) != null) {
					mapResponse.put(getId(), response);
				}
			}
		}
		Collections.sort(response);
	}
	
	public ArrayList<String> getResponse() {
		return response;
	}
	
	public static HashMap<Integer, ArrayList<String>> fullMap() {
		return mapResponse;
	}
}