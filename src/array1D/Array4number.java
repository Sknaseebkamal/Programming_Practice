package array1D;

import java.util.Arrays;

public class Array4number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=0;i<=n;i++) {
//			System.out.println(i);
//		}
		int[] res =build1(6);
		System.out.println(Arrays.toString(res));
	}
	static int[] build1(int n) {
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=i+1;
		}
		return a;
	}

}
