package assignmetOverriding;
/*
WAP to create class shape with method draw().
create class circle, square, Rectangle which extends Shape 
implement draw() differently in each child.
*/public class ShapeMain {
	 
	public static void main(String[] args) {
	        Shape shape1 = new Circle();
	        Shape shape2 = new Square();
	        Shape shape3 = new Rectangle();

	        shape1.draw(); // Drawing a circle
	        shape2.draw(); // Drawing a square
	        shape3.draw(); // Drawing a rectangle
	 }
}

class Shape {
	void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square extends Shape {

	@Override
    void draw() {
       System.out.println("Drawing a square");
	}
}

class Rectangle extends Shape {
    
	@Override
    void draw() {
        System.out.println("Drawing a rectangle");
	}
}

