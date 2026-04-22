package array1D;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer ,Integer> map =new HashMap<Integer, Integer>();
		int a[]= {4,2,6,4,1,9,2,6,4,8};
		int count[]=new int[100001];
		for(int i=0;i<a.length;i++) {
			int index=a[i];
			count[index]++;
		}
		
		System.out.println(Arrays.toString(count));
		for(int i=0;i<count.length;i++) {
			if(count[i]==0) continue;
			System.out.println(i+"->"+count[i]);
		}
	}

}
