package chapter4;

public class Student 
{
	public static void main(String[] args) {
		Student A = new Student(23, 6.79);
		Student B = new Student(6.79);
		Student C = new Student(23);
		
		
	}
	private int stuNum;
	private double gpa;
	Student(int num, double avg)
	{
		stuNum = num;
		gpa = avg;
		System.out.println("IT worked");
	}
	Student(Double avg)
	{
		stuNum = 999;
		gpa = avg;
	}
	Student(int num)
	{
		stuNum = num;
		gpa = 0.0;
	}
	Student()
	{
		stuNum = 999;
		gpa = 0.0;
	}

}
