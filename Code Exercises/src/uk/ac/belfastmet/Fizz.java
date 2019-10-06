package uk.ac.belfastmet;

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizzBuzz(2, 6);

	}
	
	public String[] fizzBuzz(int start, int end) {
		  String[] result = new String[end-start];
		  int currentNumber = start;
		  
		  
		  
		  for(int index = 0; index < end-start; index++);
		  {
		    if(currentNumber % 15 == 0)
		    {
		      result[index] = "FizzBuzz";
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
		      result[index] = String.valueOf(currentNumber);
		    }
		    
		    
		  }
		  
		  
		  
		  
		  
		  return result;
		}

}
