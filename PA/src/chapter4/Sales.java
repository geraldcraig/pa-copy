package chapter4;

public class Sales {

	public static void main(String[] args) {
		
		int itemsSold = 20;
		int totalValue = 40;
		int discountRate = 80;
		int DISCOUNT = 10;
		
				
		final int MIN_ITEMS = 3;
		final int MIN_VALUE = 10;
		final int SALES_BONUS = 55;
		int bonus = 0;
		
		if(itemsSold >= MIN_ITEMS || totalValue >= MIN_VALUE) {
			
			discountRate = DISCOUNT;
			//bonus = SALES_BONUS;
		
		}
		System.out.println(DISCOUNT);
	}

}
