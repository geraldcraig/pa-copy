package TechTest;

/*Given a string, return true if the string starts 
 * with "hi" and false otherwise.
 * 
 * startHi("hi there") - true
 * startHi("hi") - true
 * startHi("hello hi") - false
 */

public class Hello {
	
	public static void main(String[] args) {

		System.out.println(startHi("hi there", "hi"));
		System.out.println("hi there".substring(0, 2));
		
	}
/**
 * this checks that the first two characters of the input string is "hi"
 * @param inStr
 * @return boolean
 */
	 public static boolean startHi(String inStr, String compare) {
		 if(inStr.substring(0, compare.length()) == compare) {
				return true;}
			else {
				return false;
			}
	}
}
