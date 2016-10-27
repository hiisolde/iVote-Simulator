/**
 * Isolde Alfaro
 * CS 356 : Object-Oriented Programming
 * A1: iVote Simulator
 * October 27th, 2016
 */
import java.util.Arrays;
//import java.util.HashMap;
import java.util.ArrayList;

public class IVoteService {
	
	public void displayTotals() {
		System.out.println(Arrays.asList(Student.fullMap()));
		
		
		int yeah = 0;
		int nah = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		
		ArrayList<String> yL = new ArrayList<String> ();
		yL.add("Yeah!");
		
		ArrayList<String> nL = new ArrayList<String> ();
		nL.add("Nah");
		
		ArrayList<String> aL = new ArrayList<String> ();
		aL.add("A");
		
		ArrayList<String> bL = new ArrayList<String> ();
		bL.add("B");
		
		ArrayList<String> cL = new ArrayList<String> ();
		cL.add("C");
		
		ArrayList<String> dL = new ArrayList<String> ();
		dL.add("D");
		
		ArrayList<String> eL = new ArrayList<String> ();
		eL.add("E");
		
		for (int i = 1; i <= Student.fullMap().size(); i++) {
			if(Student.fullMap().get(i).equals(yL)) {
				yeah++;

			} else if (Student.fullMap().get(i).equals(nL)) {
				nah++;
			} else {
				//Still need to implement this!
				System.out.println("This is an array!");
			}		
		}
		
		
		System.out.println("Yeah!: " + yeah);
		System.out.println("Nah: " + nah);
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
		System.out.println("E: " + e);
	}
	
}
