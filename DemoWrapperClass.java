package lab13_wrapper_class_GUI.labWrapperClassGui;

public class DemoWrapperClass {

	String minMax() {
//		System.out.println("Byte: ");
//		System.out.println("Min: " + Byte.MIN_VALUE);
//		System.out.println("Max: " + Byte.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Short: ");
//		System.out.println("Min: " + Short.MIN_VALUE);
//		System.out.println("Max: " + Short.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Integer: ");
//		System.out.println("Min: " + Integer.MIN_VALUE);
//		System.out.println("Max: " + Integer.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Long: ");
//		System.out.println("Min: " + Long.MIN_VALUE);
//		System.out.println("Max: " + Long.MAX_VALUE);
//		System.out.println();
		
		return 	(
					"Byte: \n" +
					"Min: " + Byte.MIN_VALUE +
					"\nMax: " + Byte.MAX_VALUE +
					
					"\n\nShort: \n" +
					"Min: " + Short.MIN_VALUE +
					"\nMax: " + Short.MAX_VALUE +
					
					"\n\nInteger: \n" +
					"Min: " + Integer.MIN_VALUE +
					"\nMax: " + Integer.MAX_VALUE +
					
					"\n\nLong: \n" +
					"Min: " + Long.MIN_VALUE +
					"\nMax: " + Long.MAX_VALUE + "\n"
				);
	}
	
	String toBinary(int number) {
//		System.out.println("Binary: " + Integer.toBinaryString(number));
//		System.out.println("Octal: " + Integer.toOctalString(number));
//		System.out.println("Hex: " + Integer.toHexString(number));
		
		return 	(
					"Binary: " + Integer.toBinaryString(number) +
					"\nOctal: " + Integer.toOctalString(number) + 
					"\nHex: " + Integer.toHexString(number) + "\n"
				);
		
	}
	
	String charProperties(char c) {
//		System.out.println("White space: " + Character.isWhitespace(c));
//		System.out.println("Digit: " + Character.isDigit(c));
//		System.out.println("Letter: " + Character.isLetter(c));
		
		return 	(
					"White space: " + Character.isWhitespace(c) +
					"\nDigit: " + Character.isDigit(c) +
					"\nLetter: " + Character.isLetter(c) + "\n"
				);
	}
}
