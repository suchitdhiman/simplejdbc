package studentmanagementsystem;

public abstract class Student {
	
	private String name;
	private int studentId;
	private String className;
	private final String schoolName = "Cambridge";
	
	protected double[] marks;
	
	public Student(String name, int studentId, String className, double[] marks) {
		this.name = name;
		this.studentId = studentId;
		this.className = className;
		this.marks = marks;
	}
	
	
	public abstract void displayDetails();
	
	// Getter and Setter method
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getSchoolName() {
		return schoolName;
	}
	
	
	
	
	
	
	

}
