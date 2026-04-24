 //spriral matrix
package array1D;

public class Array24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[][]=new int [n][n];
		int val=1;
		char dir='r';
		int row=0;
		int col=0;
		for(int i=1;i<=n*n;i++) {
			switch(dir) {
			case 'r':
				a[row][col]=val;
				val++;
				if(row+col==n-1) {
					dir='d';
					row ++;
				}else
					col++;
				break;
			case 'd':
				a[row][col]=val;
				val++;
				if(row==col) {
					dir='l';
					col--;
				}else
					row++;
				break;
			case 'l':
				a[row][col]=val;
				val++;
				if(row+col==n-1) {
					dir='u';
					row --;
				}else
					col--;
				break;
			case 'u':
				a[row][col]=val;
				val++;
				if(row-col==1) {
					dir='r';
					col++;
				}else
					row--;
				break;
			}
	}
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}

}
