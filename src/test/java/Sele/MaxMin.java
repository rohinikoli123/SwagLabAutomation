package Sele;

public class MaxMin {

	public static void main(String[] args) {
		
		int[]ar={34,456,34,56,6767,783,34,65};
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++){
		if(ar[i]>max){
		max=ar[i];
		}

		if(ar[i]<min){
		min=ar[i];
		}
		System.out.println("Max is "+max+" min is "+min+"");
		}
		
	}
		
		
		
	}
	
	
	
	
