package com.assignmentWrapper;
//7.	Show use of valueof(String) method of wrapper class.
public class ValueOfStringEx {
	
	public static void main(String[] args) {

		// Converting string values to wrapper class objects using valueOf method
		String byteStr = "100";
	    Byte byteObject = Byte.valueOf(byteStr);
	    System.out.println("Byte object: " + byteObject);

	    String shortStr = "200";
	    Short shortObject = Short.valueOf(shortStr);
	    System.out.println("Short object: " + shortObject);
	    
	    String intStr = "300";
	    Integer intObject = Integer.valueOf(intStr);
        System.out.println("Integer object: " + intObject);

        String longStr = "400";
	    Long longObject = Long.valueOf(longStr);
        System.out.println("Long object: " + longObject);

        String floatStr = "3.14";
	    Float floatObject = Float.valueOf(floatStr);
        System.out.println("Float object: " + floatObject);
        
        String doubleStr = "6.28";
	    Double doubleObject = Double.valueOf(doubleStr);
	    System.out.println("Double object: " + doubleObject);
	    
	    String booleanStr = "true";
	    Boolean booleanObject = Boolean.valueOf(booleanStr);
	    System.out.println("Boolean object: " + booleanObject);

	    String charStr = "A";
	    Character charObject = Character.valueOf(charStr.charAt(0));
	    System.out.println("Character object: " + charObject);
	}
}
