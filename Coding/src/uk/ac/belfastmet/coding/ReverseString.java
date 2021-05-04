package uk.ac.belfastmet.coding;

public class ReverseString {
	
	public String reverse(String str) {
		StringBuilder result = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--) result.append(str.charAt(i));
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverse("dcba"));
	}
}