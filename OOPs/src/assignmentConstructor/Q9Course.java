package assignmentConstructor;

/*
9. Create Course class with id and name. Course also contains SubCourse object which is a
class containing subCourseId, subCourseName. Create default constructor for both and see
each object and object constructor being called one by one. First SubCourse constructor
should be called.
*/public class Q9Course {
	
	private int courseId;
	private String courseName;
	private SubCourse subCr;
	
	public Q9Course(){
		new SubCourse();
		System.out.println("Inside Course Default");
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public SubCourse getSubCr() {
		return subCr;
	}

	public void setSubCr(SubCourse subCr) {
		this.subCr = subCr;
	}

	@Override
	public String toString() {
		return "Q9Course [courseId=" + courseId + ", courseName=" + courseName + ", subCr=" + subCr + "]";
	}
	
	public static void main(String[] args) {
		Q9Course c = new Q9Course();
		c.setCourseId(1);
		c.setCourseName("Java");
		System.out.println(c);
	}
	
}
