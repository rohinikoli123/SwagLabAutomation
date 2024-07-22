package Sele;

public class DuplicateElementArray {
   int i,j;
	public static void main(String[] args) {
		
	int []a=new int [] {1,1,3,4,5,5,6,7};
	
	System.out.println("Duplicate element of an arreay:");
	
	for (int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
		
	
			if(a[i]==a[j]) 
				System.out.println(a[j]);
		
		}
			
		}
		
	}

	}
	



