package uk.ac.belfastmet.coding;

public class Solution {
	
	 /*
	  Method to find multiples of 3 and 5
	  and add them
	  */
	  public int solution(int number) {
	    //TODO: find the sum of multiples of 3 and 5 below a given number
	    int sum = 0;
	   

	    //loop through all the numbers below a given number
	   for( int index = 0; index < number; index++) 
	     //check if number is divisible by 3 and add to sum
	    if(index % 3 == 0) {
	      //add number to sum
	      sum += index;
	     // x.add(index);
	     // three += index;
	      //check if number is divisible by 5 and add to sum
	    } else if (index % 5 == 0) {
	      //add number to sum
	     sum += index;
	     // y.add(index);
	      //five += index;
	    }
	    //return total of sum
	    return sum;
	  }


}
