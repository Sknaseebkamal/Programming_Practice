package array1D;

import java.util.Arrays;

public class Array10topointerreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,2,5,1,3,4};
		int res[]=reverse(a);
		System.out.println(Arrays.toString(res));
	}
	static int[] reverse(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}
		return a;
	}

}
