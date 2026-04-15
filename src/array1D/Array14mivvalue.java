package array1D;

public class Array14mivvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a[]= {2,4,5,6,7,2,4,6,2,1,9,0,-20};
					int res=min(a);
					System.out.println(res);
				}
				static int min(int a[]) {
				if(a.length==0) throw new RuntimeException("empty array");
				int min=Integer.MAX_VALUE;
				for(int x:a) {
					if(x<min) min=x;
				}
			return min;
			}
			
		}
