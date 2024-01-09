package com.encapsulation;

public class Library {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setId(101);
		b1.setBname("HarryPotter");
		b1.setPrice(500);
		
		Book b2 = new Book();
		b2.setId(102);
		b2.setBname("Julius Ceaser");
		b2.setPrice(1210);
		
		System.out.println("Book-1 "+b1.getId()+", "+b1.getBname()+", "+b1.getPrice());
		System.out.println("Book-2 "+b2.getId()+", "+b2.getBname()+", "+b2.getPrice());

		Book b3 = new Book();
		System.out.println("Book-3 "+b3.getId()+", "+b3.getBname()+", "+b3.getPrice());
	}

}
