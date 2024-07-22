package Sele;
//Reverse array
public class Practic3 {

	public static void main(String[] args) {
	     int[] arr = new int[] {2, 5, 7, 5, 3, 3};

	        // Print the original array
	        System.out.println("Original array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        // Print a new line for better readability
	        System.out.println();
	        
	        // Print the array in reverse order
	        System.out.println("Array in reverse order:");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}