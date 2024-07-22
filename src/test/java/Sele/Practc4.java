package Sele;
//Duplicate char of an array
public class Practc4 {

	public static void main(String[] args) {
	      String str = "rohinioohh";
	        int count;
	        char[] string = str.toCharArray();
	        
	        System.out.println("Duplicate characters of the string:");
	        
	        for (int i = 0; i < string.length; i++) {
	            count = 1;
	            if (string[i] == '0') {
	                continue; // Skip characters that have already been processed
	            }
	            for (int j = i + 1; j < string.length; j++) {
	                if (string[i] == string[j]) {
	                    count++;
	                    string[j] = '0'; // Mark this character as visited
	                }
	            }
	            if (count > 1) {
	                System.out.println(string[i]);
	            }
	        }
	    }
	}

