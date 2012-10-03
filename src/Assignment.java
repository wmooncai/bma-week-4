/**
 * @author Wallace Mooncai
 * @since 9/30/2012
 * 
 * Crossfire BNMA Day 4 Homework
 * 
 * Here's the weeks homework.  The reading is light to make room for the
 * programming assignment.
 * 
 * 1) For all who have not set up a github account and shared it, please
 *  do.  The next class will cover getting our android projects on version
 *  control, so we are going to need this.
 * 
 * 2) Read all of chapter 6 in "Java: A Beginner's Guide"
 * 
 * 3) Programming Assignment (2 parts)
 * 
 *   Part 1) Create a new class with a main method having the following features
:
 *          1. If the args parameter is empty (length==0), print a
 *           message requesting an action and return from the function
 *          2. Otherwise, assign the value of the first parameter to a
 *           String variable named "action".
 *         3. Create and if-else ladder checking the value of action
 *           against the following strings: "for-each", "for", "while"
 *          4. If the action variable matches one of these strings, print
 *           "match: [value of action]"
 *          5. If no action is matches, print "no match found for [value
 *           of action]"
 *          6. Test the program with different values
 *
 *   Part 2) Add the following functionality to the class created in Part 1
 *          1. Create the following three static void methods
 *                     a) static void testForEach(String[] args)
 *                     b) static void testFor(String[] args)
 *                     c) static void testWhile(String[] args)
 *          2. To each of the above methods, print a line saying "Testing
 *           [action being tested]" (testForEach=>"for-each", etc...)
 *          3. In main(), after the action variable is initialized,
 *           declare and initialize a array of Strings called values to an array
 *           that can take 1 less element than args.
 *                     a) String[] values = new String[args.length-1];
 *          4. Assign to values all elements in the args array starting
 *           with the second element (skip the first).
 *                     a) Hint: if the args array's length is less, than
 *                        2, do nothing.  There are no elements to copy.
 *                     b) Hint: this could be achieved with a for loop
 *           with its iteration variable initialized to 1
 *          5. For each String comparison in the if-else ladder
 *                     a) if a match is made, call the new associated method
 *                     b) remove the original print statement
 *          6. In each of the new methods
 *                     a)Loop through the values array and print each
 *                       value using the style of loop the method is testing
 *          7. Test the class with different arguments
 *
 */


public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String action = "";
		// String values[(args.length - 1)];
		String values[] = new String[(args.length - 1)];
		
		// Check if there are any arguments
		if (args.length == 0) {
			System.out.println("Please rerun with arguments.");
			return;

		} else action = args[0];
		
		for (int i = 1; i < args.length; i++) {
			values[(i-1)] = args[i];
		} // for loop
		
		// Determine action from args
		// Normally, OR the conditions since the actions are the same, but the HW calls for an if-then tree
		if (action.equals("for-each")) {
			// System.out.println("match: " + action);
			testForEach(values);
			
		} else if (action.equals("for")) {
			// System.out.println("match: " + action);
			testFor(values);
			
		} else if (action.equals("while")) {
			// System.out.println("match: " + action);
			testWhile(values);
			
		} else System.out.println("no match found for " + action);

	} // main()
	
	/* *****************************************************************
	 * 				Method testForEach()
	 * ***************************************************************** */
	static void testForEach(String[] vals) {
		System.out.println("Testing for-each");
		
		for (String item : vals) {
			System.out.println(item);
		} // foreach loop
		
	} // testForEach()
	
	/* *****************************************************************
	 * 				Method testFor()
	 * ***************************************************************** */
	static void testFor(String[] vals) {
		System.out.println("Testing for");
		
		for (int i = 0; i < vals.length; i++) {
			System.out.println(vals[i]);
		} // for loop

	} // testFor()
	
	/* *****************************************************************
	 * 				Method testWhile()
	 * ***************************************************************** */
	static void testWhile(String[] vals) {
		System.out.println("Testing while");
		
		int i = 0;
		while ( i < vals.length ) {
			System.out.println(vals[i]);
			i++;
		} // while loop
		
	} // testWhile()
	
} // CLASS MooncaiBNMADay2HW
