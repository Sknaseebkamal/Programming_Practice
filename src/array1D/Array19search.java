package array1D;

public class Array19search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,4,9,8,7};
		
		System.out.println(search(a,1));
	}
	static int search(int a[],int key) {
		//TODO return index if key if present otherwise -1
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}
}
