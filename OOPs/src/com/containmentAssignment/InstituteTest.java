package com.containmentAssignment;

public class InstituteTest {

	public static void main(String[] args) {
		Institute obj = new Institute();
		obj.setId(1);
		obj.setName("SITS");
		
		obj.setBranch(new Branch());
		obj.getBranch().setId(11);
		obj.getBranch().setName("IT");
		
		obj.getBranch().setSubject(new Subject());
		obj.getBranch().getSubject().setId(111);
		obj.getBranch().getSubject().setName("Java");
		
		obj.getBranch().getSubject().setTopic(new Topic());
		obj.getBranch().getSubject().getTopic().setId(1111);
		obj.getBranch().getSubject().getTopic().setName("Constructor");

		obj.getBranch().getSubject().getTopic().setSubtopic(new SubTopic());
		obj.getBranch().getSubject().getTopic().getSubtopic().setId(11111);
		obj.getBranch().getSubject().getTopic().getSubtopic().setName("containment");
		
		obj.getBranch().getSubject().getTopic().getSubtopic().setQue(new Question());
		obj.getBranch().getSubject().getTopic().getSubtopic().getQue().setId(01);
		obj.getBranch().getSubject().getTopic().getSubtopic().getQue().setName("What is const");
		System.out.println(obj);
	}

}
