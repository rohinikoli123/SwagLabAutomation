package Sele;

public class Practic2 {
//Duplicate element of an array
	public static void main(String[] args) {
		  int[] arr = new int[] {1, 1, 3, 4,5,6,8,4};
	        System.out.println("Duplicate elements of the array:");
	        
	        // Iterate through the array to find duplicates
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                // Check if the elements are duplicates
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[j]);
	                    break; // Break to avoid printing the same duplicate multiple times
	                }
	            }
	        }
	    }
	}