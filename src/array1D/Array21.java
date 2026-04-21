package array1D;

import java.util.HashMap;
import java.util.Map;

public class Array21 {

	public static void main(String[] args) {
		Map<Integer ,Integer> map =new HashMap<Integer, Integer>();
		int a[]= {2,5,8,4,3,7,6,5,5,4,5,2,2,2,5,2,9};
		for(int i=0;i<a.length;i++) {
			if(map.get(a[i])==null) {
				map.put(a[i], 1);
			}
			else {
				int c=map.get(a[i]);
				c++;
				map.put(a[i], c);
			}
		}
		System.out.println(map);
	}

}
