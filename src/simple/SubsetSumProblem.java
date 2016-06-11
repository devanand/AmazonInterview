package simple;

public class SubsetSumProblem {

	static void subsetSum(int a[], int sum) {
		int n = a.length;
		boolean buffer[][] = new boolean[sum+1][n+1];
		
		for(int i=0;i<=n;i++) {
			buffer[0][i] = true;
		}
		
		for(int i=0;i<=sum;i++) {
			buffer[i][0] = false;
		}
		
		for(int i=1;i<=sum;i++) {
			for(int j=1;j<=n;j++) {
				buffer[i][j] = buffer[i][j-1];
				if(i>=a[j-1]) {
					buffer[i][j] = buffer[i][j]||buffer[i-a[j-1]][j-1];
				}
			}
		}
		
		System.out.println(buffer[sum][n]);
	}
	
	public static void main(String[] args) {
		int a[] = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		subsetSum(a, sum);
	}
}
