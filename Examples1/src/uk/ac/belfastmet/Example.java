package uk.ac.belfastmet;

//just include javadoc statements here the same as you have down in NonEmptyString class

public class Example {
	
	private int a = 4;
	private int b = 5;
	


	public static void main(String[] args) {
		
		
		Example example = new Example();
	/*	example.printExample();
		
		example.forCondition();
		example.whileCondition();*/
		//example.switchStatement();
		example.firstCharacter();
		example.startCharacter();
		//example.endCharacter();
		example.subCharacter();
		example.containCharacter();
		example.indexString();
		example.splitString();
		example.upperCase();
		
	}
	
	public void upperCase() {
		String sentence = "I am studying";
		sentence = sentence.toUpperCase();
		System.out.println("upper case sentence: " + sentence);
	}
	
	public void splitString() {
		String sentence = "I am studying";
		String[] strings = sentence.split(" ");
		System.out.println("Length is " + strings);
		for(int index = 0; index < strings.length; index++) {
			System.out.println(strings[index]);
		}
	}
	
	public void indexString() {
		String name = "gerald";
		int index = name.indexOf("al");
		System.out.println("Index of " + index);
		
	}
	
	public void containCharacter() {
		String name = "gerald";
		boolean contains = name.contains("ra");
		if(contains) {
			System.out.println("it contains");
		}
	}
	
	
	public void subCharacter() {
		String name = "gerald";
		String subCharacter = name.substring(2, 4);
		System.out.println(subCharacter);
		
	}
	
	public void firstCharacter() {
		String name = "gerald";
		char letter = name.charAt(0);
		System.out.println(letter);
	}
	
	public void startCharacter() {
		String name = "gerald";
		boolean startWith = name.startsWith("g");
		if(startWith) {
			System.out.println("It starts with the character");
		}
	}
	
	//Give explanation as to why this code was commented out
	
	/*public void endCharacter() {
		String name = "gerald";
		boolean 
		
	}
	
	
	public void switchStatement() {
		
		String day = "Monday";
		
		switch (day) {
		  case "Monday":
		    System.out.println("Monday");
		    break;
		  case "Tuesday":
		    System.out.println("Tuesday");
		    break;
		  case "Wednesday":
		    System.out.println("Wednesday");
		    break;
		  case "Thursday":
		    System.out.println("Thursday");
		    break;
		  case "Friday":
		    System.out.println("Friday");
		    break;
		  case "Saturday":
		    System.out.println("Saturday");
		    break;
		  case "Sunday":
		    System.out.println("Sunday");
		    break;
		
	}	
		
	
	/*public void printExample() {
		
		if (a < b) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
		
		if(!(a < b)) {
			System.out.println("a is less than b");
		} else if (a > b) {
			System.out.println("a is more than b");
		}
		
		
	}
	
	/*public void forCondition() {
			
		for(int index = 10; index >= 0; index-- ) {
			System.out.println("index " + index);
		}
		
	public void whileCondition() {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}
	
	}
	
	public void doWhileCondition() {
		int index = 0;
		do {
			System.out.println("index:" + index);
			index++;
		}
		while (index < 5);
	}*/
	
	/*String day = "Monday";
	
	switch (day) {
	
	case 1;
		
		System.out.println("Monday");
		break;
		
	case 2;
		
		System.out.println("Tuesday");
		break;
		
	case 3;
		
		System.out.println("Wednesday");
		break;
	case 4;
		
		System.out.println("Thursday");
		break;
	case 5;
	
		System.out.println("Friday");
		break;
	case 6;

		System.out.println("Saturday");
		break;
	case 7;

		System.out.println("Sunday");
		break;
		default;
		
		
	}*/
	
	}