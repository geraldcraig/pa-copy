package uk.ac.belfastmet;

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizzBuzz(0, 100);

	}
	
	public static String[] fizzBuzz(int start, int end) {
		  String[] result = new String[end-start];
		  int currentNumber = start;
		  
		  
		  
		  for(int i = 0; i < end-start; i++);
		  {
		    if(currentNumber % 15 == 0)
		    {
		      result[i]. += "FizzBuzz"; 
		    }
		    else if(currentNumber % 3 == 0)
		    {
		      result[index] = "Fizz";
		    }
		    else if(currentNumber % 5 == 0)
		    {
		      result[index] = "Buzz";
		    }
		    else
		    {
		      result[i] = String.valueOf(currentNumber);
		    }
		    
		    
		  }		  
		  
		  return result;
		}

}
