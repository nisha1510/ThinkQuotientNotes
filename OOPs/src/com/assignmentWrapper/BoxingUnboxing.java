package com.assignmentWrapper;

public class BoxingUnboxing {
	
	public static void main(String[] args) {
		
		byte byteValue = 10;
	    Byte boxedByte = Byte.valueOf(byteValue); // Boxing - byte to Byte
	    byte unboxedByte = boxedByte.byteValue(); // Unboxing - Byte to byte

	     
	    short shortValue = 20;
	    Short boxedShort = Short.valueOf(shortValue); // Boxing - short to Short
	    short unboxedShort = boxedShort.shortValue(); // Unboxing - Short to short

	    int intValue = 30;
	    Integer boxedInt = Integer.valueOf(intValue); // Boxing - int to Integer
        int unboxedInt = boxedInt.intValue(); // Unboxing - Integer to int
        
        long longValue = 40L;
	    Long boxedLong = Long.valueOf(longValue); // Boxing - long to Long
	    long unboxedLong = boxedLong.longValue(); // Unboxing - Long to long

	    float floatValue = 50.5f;
        Float boxedFloat = Float.valueOf(floatValue); // Boxing - float to Float
        float unboxedFloat = boxedFloat.floatValue(); // Unboxing - Float to float

        double doubleValue = 60.6;
	    Double boxedDouble = Double.valueOf(doubleValue); // Boxing - double to Double
        double unboxedDouble = boxedDouble.doubleValue(); // Unboxing - Double to double

        char charValue = 'A';
	    Character boxedChar = Character.valueOf(charValue); // Boxing - char to Character
        char unboxedChar = boxedChar.charValue(); // Unboxing - Character to char

        boolean boolValue = true;
	    Boolean boxedBool = Boolean.valueOf(boolValue); // Boxing - boolean to Boolean
        boolean unboxedBool = boxedBool.booleanValue(); // Unboxing - Boolean to boolean

        System.out.println("Byte: " + byteValue + " - Boxed: " + boxedByte + " - Unboxed: " + unboxedByte);
	    System.out.println("Short: " + shortValue + " - Boxed: " + boxedShort + " - Unboxed: " + unboxedShort);
        System.out.println("Integer: " + intValue + " - Boxed: " + boxedInt + " - Unboxed: " + unboxedInt);
        System.out.println("Long: " + longValue + " - Boxed: " + boxedLong + " - Unboxed: " + unboxedLong);
        System.out.println("Float: " + floatValue + " - Boxed: " + boxedFloat + " - Unboxed: " + unboxedFloat);
        System.out.println("Double: " + doubleValue + " - Boxed: " + boxedDouble + " - Unboxed: " + unboxedDouble);
        System.out.println("Character: " + charValue + " - Boxed: " + boxedChar + " - Unboxed: " + unboxedChar);
        System.out.println("Boolean: " + boolValue + " - Boxed: " + boxedBool + " - Unboxed: " + unboxedBool);
    }
}
