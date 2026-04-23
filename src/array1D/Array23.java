package array1D;

public class Array23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,9,1,6,4,1,3,2};
		int max=Integer.MIN_VALUE;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>max) {
				System.out.println(a[i]);
				max=a[i];
			}
		}
	}

}
