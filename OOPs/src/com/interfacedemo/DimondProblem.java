package com.interfacedemo;

interface Stud{
	void show();
	
	default void display() {
		System.out.println("i'm student");
	}
}
interface Teacher{
	void show();
	
	default void display() {
		System.out.println("i'm teacher");
	}
}
public class DimondProblem implements Stud, Teacher{

	@Override
	public void show() {
		System.out.println("School Name : Heritage school");
	}
	@Override
	public void display() {
	//	System.out.println("in school");
		Stud.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {
		DimondProblem d1 = new DimondProblem();
		d1.show();
		d1.display();
	}

}
