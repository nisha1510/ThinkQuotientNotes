package com.containment;

public class College {

	public static void main(String[] args) {
		
		Course c1 = new Course(101,"Java",3600);
		Course c2 = new Course(102,"Python",4600);
		Course c3 = new Course(103,"FullStack",6500);
	
		Student s1 = new Student(1,"Nisha",c1);
		Student s2 = new Student(2,"Rutuja",c2);
		Student s3 = new Student(3,"Sneha",c3);
		Student s4 = new Student(4,"Priti",c1);
		Student s5 = new Student(5,"Isha",c3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		//Anonymous Object
		
		new Student(6,"prachi",c1);
		
		Student s6 = new Student(6,"Disha",new Course(104,"Go",2500));
		Student s7 = new Student(7,"Nayan",new Course(104,"Go",2500));
	
		System.out.println(s6);
		System.out.println(s7);
		
		//Through Getter & Setter
		//1)
		
		Course c = new Course();
		c.setCid(101);
		c.setCname("Angular");
		c.setFees(67000);
		Student s = new Student();
		s.setSid(1);
		s.setSname("Pooja");
		s.setCourse(c);
		System.out.println(s);
		
		//2)
		
		Student st = new Student();
		st.setSid(9);
		st.setSname("Pooja");
		st.setCourse(new Course());
		st.getCourse().setCid(109);
		st.getCourse().setCname("C++");
		st.getCourse().setFees(88000);
		System.out.println(st);
		
	}

}
