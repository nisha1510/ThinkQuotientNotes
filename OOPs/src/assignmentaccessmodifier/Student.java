package assignmentaccessmodifier;

public class Student {
	private int rollNo;
	int admissionNo; 
	protected double age; 
	public String courseId;
	

	public static void doPublic() {
		System.out.println("doPublic");
	}
	//Default methods are allowed only in interfaces.
//	default static void doDefault(){
//		
//	}
	
	protected static void doProtected() {
		System.out.println("doProtected");
	}
	private static void doPrivate() {
		System.out.println("doPrivate");
	}
	
	
	public Student() {
		
	}
	
	public Student(int rollNo, int admissionNo, double age, String courseId) {
		this.rollNo = rollNo;
		this.admissionNo = admissionNo;
		this.age = age;
		this.courseId = courseId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String toString() {
		return "Student [rollNo=" + rollNo + ", admissionNo=" + admissionNo + ", age=" + age + ", courseId=" + courseId
				+ "]";
	}	
}

/*
1. Create a class Student with 4 variables called as rollNo, admissionNo, age, 
courseId. Each of the variables should have one of the access modifier: public, 
protected, no-access-modifier and private. Add 4 methods in the class: public 
method doPublic, no access modifier method doDefault, protected method 
doProtected, private method doPrivate. 
a. In main method outside the class but in same package – create object of type 
Student. 
i. Try to access all the variables and all the methods in it. Verify the visibility 
against the access modifier table. 
*/