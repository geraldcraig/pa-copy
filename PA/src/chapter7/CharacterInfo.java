package chapter7;

public class CharacterInfo {

	public static void main(String[] args)
	{
		char aChar = 'e';
		System.out.println("The character is " + aChar);
		if(Character.isUpperCase(aChar))
			System.out.println(aChar + " is uppercase");
		else
			System.out.println(aChar + " is not uppercase");
		if(Character.isLowerCase(aChar))
			System.out.println(aChar + " is lowercase");
		else
			System.out.println(aChar + " is not lowercase");
		aChar = Character.toLowerCase(aChar);
		System.out.println("After toLowerCase(), aChar is " + aChar);
		
			
		

	}

}
