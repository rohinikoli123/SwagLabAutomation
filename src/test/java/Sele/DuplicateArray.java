package Sele;

public class DuplicateArray {

	public static void main(String[] args) {
		int j;
		int[]arr=new int[]{3,34,5,6,5,4,4,3,3,2};
		System.out.println("Duplicate element of an array:");
		for(int i=0;i<arr.length;i++) {
		
		
for(j=i+1;j<arr.length;j++) {
	if(arr[i]==arr[j]) {
		System.out.println(arr[j]);
	}
}
	}

}
}