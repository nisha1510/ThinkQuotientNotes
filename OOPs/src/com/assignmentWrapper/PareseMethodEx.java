package com.assignmentWrapper;
//5.	Convert “100” to primitive byte , int, short , float double 
//using parse method of corresponding wrapper classes.
public class PareseMethodEx {

	public static void main(String[] args) {
	
		String numberStr = "100";

	    // Converting string to primitive types using parse methods
        byte byteValue = Byte.parseByte(numberStr);
        int intValue = Integer.parseInt(numberStr);
	    short shortValue = Short.parseShort(numberStr);
        float floatValue = Float.parseFloat(numberStr);
        double doubleValue = Double.parseDouble(numberStr);
        
        System.out.println("Byte value: " + byteValue);
	    System.out.println("Integer value: " + intValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Float value: " + floatValue);
    }
}
