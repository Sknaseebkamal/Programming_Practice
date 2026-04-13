package array1D;

import java.util.Arrays;

public class Array11topointerrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,2,5,1,3,4};
		int res[]=reverse(a,0,a.length-1);
		System.out.println(Arrays.toString(res));
	}
	static int[] reverse(int a[],int i,int j) {
		if(i>j) return a;
	
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		
		return reverse(a, ++i,--j);
	}

}
