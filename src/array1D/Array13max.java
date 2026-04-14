package array1D;



public class Array13max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5,6,7,2,4,6,2,1,9};
			int res=max(a);
			System.out.println(res);
		}
		static int max(int a[]) {
		if(a.length==0) throw new RuntimeException("empty array");
		int max=Integer.MIN_VALUE;
		for(int x:a) {
			if(x>max) max=x;
		}
	return max;
	}
	
}
