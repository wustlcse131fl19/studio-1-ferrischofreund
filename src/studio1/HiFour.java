package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name1 = ap.nextString("What is the first group members name?");
		String name2 = ap.nextString("Second group members name?");
		String name3 = ap.nextString("Third group members name?");
		String name4 = ap.nextString("Last group members name?");
		//
		// Say hello to the names in s0 through s3.
		//ArgsProcessor ap = new ArgsProcessor(args);
		//		String name = ap.nextString("What is your name?  ");
		//		System.out.println("Hi " + name + ".  How are you?");
		System.out.println("Greetings " + name1 + ", " + name2 + ", " + name3 + ", and " + name4 + ".");

	}
}
