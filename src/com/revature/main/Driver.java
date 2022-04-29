package com.revature.main;

public class Driver {
	
	public static void main(String[] args) {
		
		String myString = "aaabbcccc";
		
		String compressedString = stringCompressor(myString);
		
		System.out.println(compressedString);
	}
	
	public static String stringCompressor(String string) {
		
		StringBuilder compressedString = new StringBuilder("");
		
		int counter = 1;
		for(int index = 0; index < string.length(); index++) {
			if(index < string.length() - 1) {
				if(string.charAt(index) == string.charAt(index + 1)) {
					counter++;
				}else {
					compressedString.append(string.charAt(index) + "" +  counter);
					counter = 1;
				}
			}else {
				compressedString.append(string.charAt(index) + "" +  counter);
			}
			
		}
		
		return compressedString.toString();
	}

}
