package uk.ac.belfastmet.coding;

public class Maximum {
	
	int findSmallest(int[] values) {
		  int minIndex = 0;  // start with 0th element as min
		  for (int i=1; i<values.length; i++) {
		    if (values[i] < values[minIndex]) {
		      minIndex = i;
		    }
		  }
		  return minIndex;
		}
	
	public static void main(String[] args) {
		Maximum maximum = new Maximum<>;
		
	}

}
