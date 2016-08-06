package Pack1;

public class StringFunctions {
	public static void main(String[] args) {
		
		String str="the rain have been started";
		
		//size: it can check the total characters of the string.
		int size=str.length();
		System.out.println("Total chars in the String: "+size);
		
		//compare: It'll compare the two strings or numbers
		String str1="The rain have been started";
		boolean eql=str.equals(str1);
		System.out.println(eql);
		
		boolean eql1=str.equalsIgnoreCase(str1);
		System.out.println(eql1);
		System.out.println(str.equalsIgnoreCase(str1));
		
		//startswith: it'll check the start chars
		System.out.println(str.startsWith("t444he"));
		
		//endswith: it'll check end keyword
		System.out.println(str.endsWith("ted"));
		
		//indexof: check index of the character:
		System.out.println(str.indexOf('t'));
		//Homework: find out second same char index:
		
		//charat: check the indexed char
		System.out.println(str.charAt(25));
		System.out.println(str.charAt(4));
		
		//substring: to get the part of the string.
		System.out.println(str.substring(19));
		System.out.println(str.substring(9));
		
		System.out.println(str.substring(9,19));
		//convert cases:
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
	}

}
