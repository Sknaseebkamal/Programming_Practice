package array1D;

public class Array15max {
public static void main(String[] args) {
	int arr[]= {2,4,21,34,5,99};
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
}
}
