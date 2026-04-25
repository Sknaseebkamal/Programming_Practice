package array1D;

public class BacktrackinReverse {
	public static void main(String[] args) {
	int a[]= {4,2,6,1,5,1};
	travarse(a, 0);
	}
static void travarse(int a[],int start) {
	if(start==a.length)return;
	travarse((a), start+1);
	System.out.println(a[start]);
	}
}
