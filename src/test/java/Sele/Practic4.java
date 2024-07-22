package Sele;
//Reverse string
public class Practic4 {

	public static void main(String[] args) {
		 String str = "Rohini";
	        System.out.println("Original string: " + str);
	        
	        int n = str.length();
	        String reverseString = "";
	        
	        // Reverse the string
	        for (int i = 0; i < n; i++) {
	            char ch = str.charAt(i);
	            reverseString = ch + reverseString; // Prepend character to the reversed string
	        }
	        
	        System.out.println("Reversed string: " + reverseString);
	    }
	}