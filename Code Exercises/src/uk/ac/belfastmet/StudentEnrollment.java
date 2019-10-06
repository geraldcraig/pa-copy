package uk.ac.belfastmet;

public class StudentEnrollment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("martin", 18);
		Student student2 = new Student("matthew", 18);
		Student student3 = new Student("gerald", 21);
		System.out.println(Student.numberOfStudents);
		System.out.println(Student.getNumberOfStudents());

	}

}
