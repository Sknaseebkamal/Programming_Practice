package array1D;

public class TravarseBackword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,5,4,3,22,4};
		int i=a.length-1;
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
	}

}
