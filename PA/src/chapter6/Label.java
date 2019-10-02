package chapter6;

public class Label {
	public static void main(String[] args)
	{
		nestingLoops();
	}

	public static void nestingLoops() 
	{
		int customer, color;
		for(customer = 1; customer <= 20; ++customer)
			System.out.println("Your customer number is " + customer );
		
		{
			for(color = 1;color <= 3; ++color)
			{
				outputLabel(customer, color);
			}
		}
	}
	
	public static void outputLabel(int cust, int col)
	{
		System.out.println("Your customer is " + cust + " and your label color is  " + col);
		
	}
	

}
