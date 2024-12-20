package studentmanagementsystem;

public class OnlineStudent extends Student implements Grading{
	
	

	private String attendanceStatus;
	private String platform;
	
	public OnlineStudent(String name, int studentId, String className, double[] marks, String attendanceStatus, String platform ) {
		super(name, studentId, className, marks);
		this.attendanceStatus = attendanceStatus;
		this.platform = platform;
		
		
	}

	@Override
	public void calculateGrade() {
		double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double percentage = (total / (marks.length * 150)) * 100;

        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F");
        }
		
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Regular Student Details: ");
		System.out.println("Name: "+ getName());
		System.out.println("Student ID: "+ getStudentId());
		System.out.println("Class No: "+ getClassName());
		System.out.println("School Name: "+ getSchoolName());
		System.out.println("Attendance: " + attendanceStatus);
		System.out.println("Platform: "+ platform);
		
		
		
	}

}
