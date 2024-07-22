package Sele;
//Prime no
public class Practi5 {

	public static void main(String[] args) {
		  int n = 3; // Number to check
	        int m = n / 2;
	        int flag = 0; // Flag to indicate if the number is not prime
	        
	        if (n <= 1) {
	            System.out.println(n + " is not a prime number");
	        } else {
	            for (int i = 2; i <= m; i++) {
	                if (n % i == 0) {
	                    System.out.println(n + " is not a prime number");
	                    flag = 1; // Set flag to indicate the number is not prime
	                    break;
	                }
	            }
	            // This block executes only if the loop completes without setting flag to 1
	            if (flag == 0) {
	                System.out.println(n + " is a prime number");
	            }
	        }
	    }
	}