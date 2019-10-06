package uk.ac.belfastmet;

/**
 * Public class NonEmptyString
 * @author cra19171869
 *
 */
public class NonEmptyString {
	
	/**
	 * Main method for NonEmptyString class
	 * @param args
	 */
	public static void main(String[] args) {
	NonEmptyString nonEmptyString = new NonEmptyString();
	
	//Call everyNth method to check different inputs
	String outcome = nonEmptyString.everyNth("Miracle", 2);
	String outcome1 = nonEmptyString.everyNth("abcdefg", 2);
	String outcome2 = nonEmptyString.everyNth("abcdefg", 3);
	
	//print out results to console
	System.out.println("The outcome is " + outcome);
	System.out.println("The outcome is " + outcome1);
	System.out.println("The outcome is " + outcome2);

	}
	
	/**
	 * everyNth method to check arguments (maybe go into more detail about what method does i.e. checks character at this index etc)
	 * @param word
	 * @param pickNumber
	 * @return
	 */
	public String everyNth(String word, int pickNumber) {
		//create new string
		String newString = "";
		for(int index =0; index < word.length(); index+=pickNumber) {
		
			System.out.println(word.charAt(index));
			newString += word.charAt(index);
			System.out.println(newString);
		}
		//return result to main method
		return newString;
	}

}
