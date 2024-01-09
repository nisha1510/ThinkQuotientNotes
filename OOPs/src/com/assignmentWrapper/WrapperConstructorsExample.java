package com.assignmentWrapper;
//Make use of all constuctors of – Byte , Short, Integer , Long , Character , Float , Double , Boolean . 
//Create objects of all above classes using every constructor available in that class
public class WrapperConstructorsExample {
    
	public static void main(String[] args) {
    
        Byte byteObj1 = new Byte((byte) 10); // Constructor with byte argument
        Byte byteObj2 = new Byte("20"); // Constructor with String argument

        Short shortObj1 = new Short((short) 30); // Constructor with short argument
        Short shortObj2 = new Short("40"); // Constructor with String argument

        Integer intObj1 = new Integer(50); // Constructor with int argument
        Integer intObj2 = new Integer("60"); // Constructor with String argument

        Long longObj1 = new Long(70L); // Constructor with long argument
        Long longObj2 = new Long("80"); // Constructor with String argument

        Character charObj1 = new Character('A'); // Constructor with char argument (Note: Character has only one constructor)

        Float floatObj1 = new Float(90.5f); // Constructor with float argument
        Float floatObj2 = new Float("100.7"); // Constructor with String argument

        Double doubleObj1 = new Double(110.9); // Constructor with double argument
        Double doubleObj2 = new Double("120.3"); // Constructor with String argument

        Boolean boolObj1 = new Boolean(true); // Constructor with boolean argument
        Boolean boolObj2 = new Boolean("false"); // Constructor with String argument

        // Displaying the objects created using constructors
        System.out.println("Byte Objects: " + byteObj1 + ", " + byteObj2);
        System.out.println("Short Objects: " + shortObj1 + ", " + shortObj2);
        System.out.println("Integer Objects: " + intObj1 + ", " + intObj2);
        System.out.println("Long Objects: " + longObj1 + ", " + longObj2);
        System.out.println("Character Object: " + charObj1);
        System.out.println("Float Objects: " + floatObj1 + ", " + floatObj2);
        System.out.println("Double Objects: " + doubleObj1 + ", " + doubleObj2);
        System.out.println("Boolean Objects: " + boolObj1 + ", " + boolObj2);
    }
}
