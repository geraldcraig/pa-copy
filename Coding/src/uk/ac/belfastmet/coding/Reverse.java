package uk.ac.belfastmet.coding;

public class Reverse {
	
	public String reverse(String word) {
	
	String result = "";
	for (int i = 0; i < word.length(); i++) {
		
		result += word.charAt(word.length() - i - 1);
	}
	
	return result;
		
}
	
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverse("gerald"));
	}

}
