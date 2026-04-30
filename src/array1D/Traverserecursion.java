package array1D;

public class Traverserecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,6,1,5,1};
		travarse(a, 0);
		}
	static void travarse(int a[],int start) {
		if(start==a.length)return;
		System.out.println(a[start]);
		travarse(a, start+1);
	}
}
