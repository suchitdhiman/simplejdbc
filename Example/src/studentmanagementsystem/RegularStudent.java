package studentmanagementsystem;

public class RegularStudent extends Student implements Grading {
	
	

	private String attendanceStatus;
	
	public RegularStudent(String name, int studentId, String className,double[] marks, String attendanceStatus) {
		super(name, studentId, className, marks);
		this.attendanceStatus = attendanceStatus;
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Regular Student Details: ");
		System.out.println("Name: "+ getName());
		System.out.println("Student ID: "+ getStudentId());
		System.out.println("Class No: "+ getClassName());
		System.out.println("School Name: "+ getSchoolName());
		System.out.println("Attendance: " + attendanceStatus);
	}

	@Override
	public void calculateGrade() {
		 double average = 0;
	        for (double mark : marks) {
	            average += mark;
	        }
	        average /= marks.length;

	        System.out.println("Average Marks: " + average);
	        if (average >= 85) {
	            System.out.println("Grade: A");
	        } else if (average >= 70) {
	            System.out.println("Grade: B");
	        } else if (average >= 50) {
	            System.out.println("Grade: C");
	        } else {
	            System.out.println("Grade: F");
	        }
	    }
	
		
		

}
