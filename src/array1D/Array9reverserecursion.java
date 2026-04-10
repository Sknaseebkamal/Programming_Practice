package array1D;

import java.util.Arrays;

public class Array9reverserecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,2,5,1,3,4};
		int res[]=reverse(a);
		System.out.println(Arrays.toString(res));
	}
	static int[] reverse (int a[]) {
		int b[]=new int [a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			b[index++]=a[i];
			
		}
		return b;
		
	}
}
