package uk.ac.belfastmet;

public class PalindromeCheck {
	
	public boolean isPalindrome(String str) {
        boolean isPalindrome=true;
        for (int i = 0; i < str.length()/2-1; i++) {
               if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                     isPalindrome=false;
                     break;
               }
        }
       
        return isPalindrome;
 }

}
