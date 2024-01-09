package com.inheritance;

class Student
{
	private int id;
	private String name;
	private double fees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", fees=" + fees ;
	}
	
	

}

class SchoolStudent extends Student
{
	private String scName;
	private int std;
	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolStudent(int id, String name, double fees, String scName, int std) {
		super(id, name, fees);
		this.scName = scName;
		this.std = std;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return super.toString()+" SchoolName=" + scName + ", std=" + std + "]";
	}
	
	
	
	
}

class CollegeStudent extends Student
{
   private String uni;
   private String course;
   private int sem;

	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(int id, String name, double fees, String uni, String course, int sem) {
		super(id, name, fees);
		this.uni = uni;
		this.course = course;
		this.sem = sem;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	@Override
	public String toString() {
		return super.toString()+" university=" + uni + ", course=" + course + ", sem=" + sem ;
	}
   
   
   

}


public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		SchoolStudent st= new SchoolStudent(1, "Aadhya", 23000, "VikasBharti", 5);
		CollegeStudent ct= new CollegeStudent(101, "Pranali", 350000,"DU" ,"BCA" , 3);
		
		System.out.println(st);
		System.out.println(ct);
				
		
	}

}
