package com.assignmentWrapper;

public class ValueOfEx {
    
	public static void main(String[] args) {
	
		// Converting primitive types to wrapper class objects using valueOf method
	        
		// Byte - valueOf method
	    byte byteValue = 100;
	    Byte byteObject = Byte.valueOf(byteValue);
	    System.out.println("Byte object: " + byteObject);

	    // Short - valueOf method
        short shortValue = 200;
        Short shortObject = Short.valueOf(shortValue);
	    System.out.println("Short object: " + shortObject);

        // Integer - valueOf method
	    int intValue = 300;
	    Integer intObject = Integer.valueOf(intValue);
        System.out.println("Integer object: " + intObject);

        // Long - valueOf method
	    long longValue = 400L;
        Long longObject = Long.valueOf(longValue);
        System.out.println("Long object: " + longObject);

	    // Float - valueOf method
        float floatValue = 3.14f;
        Float floatObject = Float.valueOf(floatValue);
	    System.out.println("Float object: " + floatObject);

	    // Double - valueOf method
	    double doubleValue = 6.28;
        Double doubleObject = Double.valueOf(doubleValue);
        System.out.println("Double object: " + doubleObject);

	    // Boolean - valueOf method
        boolean booleanValue = true;
        Boolean booleanObject = Boolean.valueOf(booleanValue);
	    System.out.println("Boolean object: " + booleanObject);

        // Character - valueOf method
	    char charValue = 'A';
	    Character charObject = Character.valueOf(charValue);
        System.out.println("Character object: " + charObject);
   }
}

