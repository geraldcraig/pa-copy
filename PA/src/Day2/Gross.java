package Day2;

public class Gross
{
public static void main(String[] args)
{
double hours = 25;
double yourHoursWorked = 37.5;
calculateGross(10, 40);
calculateGross(hours, 35);
calculateGross(yourHoursWorked, 50);
	
}
public static double calculateGross(double hours, double rate)
{
	double gross;
	gross = hours * rate;
	System.out.println(hours + " hours at $" + 
	rate + " per hour is $"+ gross);
	return gross;
	
}
public static double calculateNetPay(double hours, double rate)
{
	double gross;
	double withholding;
	double net;
	gross = calculateGross(hours, rate);
	withholding = calculateWithholding(gross);
	net = gross - withholding;
	return net;
	
}
private static double calculateWithholding(double gross) {
	// TODO Auto-generated method stub
	return 0;
}
}

