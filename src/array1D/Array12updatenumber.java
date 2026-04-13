package array1D;

import java.util.Arrays;

public class Array12updatenumber {

	public static void main(String[] args) {
		int a[]= {9,2,5,1,3,4};
		int res=update(a,4,6);
		
		System.out.println(res);
		System.out.println(Arrays.toString(a));
	}
	static int update(int a[],int index,int key) {
		if(index<0|| index >=a.length) 
			throw new RuntimeException("Invalid index");
			int old=a[index];
			a[index]=key;
			return old;
			
	}

}