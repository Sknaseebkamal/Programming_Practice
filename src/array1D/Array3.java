package array1D;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]=new Integer[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=sc.nextInt();
		Integer a1[]=new Integer[size];//0 to size-1 ,0 to a.length-1
		System.out.println("Enter " + a1.length+"elements");
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));
	}

}
