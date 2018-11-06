package lab13_wrapper_class_GUI.labWrapperClassGui;

public class DemoWrapperClass {

	String minMax() {
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
		return 	(
					"Binary: " + Integer.toBinaryString(number) +
					"\nOctal: " + Integer.toOctalString(number) + 
					"\nHex: " + Integer.toHexString(number) + "\n"
				);
		
	}
	
	String charProperties(char c) {
		String output = "";
		
		if(Character.isLetter(c)) {
			if(Character.isUpperCase(c)) {
				output = Character.toLowerCase(c) + "|" + Character.toUpperCase(c);
			} else if (Character.isLowerCase(c)) {
				output = Character.toUpperCase(c) + "|" + Character.toLowerCase(c);
			}
		} else {
			output = "false";
		}
		
		return 	(
					"White space: " + Character.isWhitespace(c) +
					"\nDigit: " + Character.isDigit(c) +
					"\nLetter: " + output + "\n"
				);
	}
}
