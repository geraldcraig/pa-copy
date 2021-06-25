package uk.ac.belfastmet.coding;



public class StringReverse {
	
	public static void main(String[] args) {
		StringReverse stringreverse = new StringReverse();
		String result = stringreverse.reverse("abcd");
		System.out.println(result);
		
	}
	
	//Iterate over str starting at the end and append to new string, return it
	public String reverse(String str) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	
	}
}
