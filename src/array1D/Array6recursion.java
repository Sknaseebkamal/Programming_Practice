package array1D;

import java.util.Arrays;

public class Array6recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = build2(6, new int[6]);
		System.out.println(Arrays.toString(res));
	}
	static int[] build2(int n,int a[]) {
		if(n==0)return a;
		a[n-1]=n;
		return build2(n-1,a);
	}
}
