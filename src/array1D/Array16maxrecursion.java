package array1D;

public class Array16maxrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,42,1,23,42,457,9};
//		System.out.println(Integer.MIN_VALUE);
		System.out.println(max(a ,Integer.MIN_VALUE, 0));
		
		}

	static int max(int a[],int max,int index) {
		if(a.length==0)throw new RuntimeException("Empty array");
		if(index==a.length) return max;
		if(max<a[index]) max=a[index];
		return max(a,max,index+1);
	}
}
