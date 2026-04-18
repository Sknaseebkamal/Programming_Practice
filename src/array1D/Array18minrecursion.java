package array1D;

public class Array18minrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,42,1,23,42,457,-9};
//		System.out.println(Integer.MIN_VALUE);
		int res=min(a ,Integer.MAX_VALUE, 0);
//      System.out.println(min(a ,Integer.MAX_VALUE, 0));
		System.out.println(res);
		
		}

	static int min(int a[],int min,int index) {
		if(a.length==0)throw new RuntimeException("Empty array");
		if(index==a.length) return min;
		if(min>a[index]) min=a[index];
		return min(a,min,index+1);
	}
}