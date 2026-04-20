package array1D;

public class Array20searchrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,34,21,13,90};
		System.out.println(search(a, 0, 4));
	}
	static int search(int a[],int index,int key) {
		if(index==a.length) return -1;
		if(a[index]==key) return index;
		return search(a, index+1, key);
	}
}
