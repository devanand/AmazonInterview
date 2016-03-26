package simple;

public class PascalTriangleMathInduction {

	static void pascalTriangle(int n) {
		int a[][]=new int[n][n];
		a[0][0] = 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0) a[i][j] = 1;
				else a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(a[i][j] == 0) {
					continue;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		pascalTriangle(5);
	}
}
