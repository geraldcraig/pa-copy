package mypackage;

public class HelloWorld {

	public static void speak(String words) {
		System.out.println(words);
	}

	public static void speaknum(int num) {
		System.out.println(num);
	}

	public static int addnums(int f, int l) {

		int a = f + l;
		return a;
	}

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		String firstName = "Gerald";
		speak(firstName);
		firstName = "Alison";
		speak(firstName);

		int firstnum = 11;
		int secnum = 12;

		// int addednums = firstnum + secnum;
		int addednums = addnums(firstnum, secnum);
		speaknum(addednums);

		if (firstnum > 9) {
			System.out.println("greater than 9 ");
		} else if (firstnum > 10) {
			System.out.println("greater than 10 ");
		}
	}

}
