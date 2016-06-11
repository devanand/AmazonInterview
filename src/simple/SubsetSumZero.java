package simple;

public class SubsetSumZero {

	public static void findSubSet(int sum, int a[]) {
		boolean sumArray[][] = new boolean[sum+1][a.length+1];
		
		for(int i=0;i<=a.length;i++) {
			sumArray[0][i] = true;
		}
		
		for(int i=0;i<=sum;i++) {
			sumArray[i][0] = false;
		}
		for(int i=1;i<=sum;i++) {
			for(int j = 1;j<=a.length;j++) {
				sumArray[i][j] = sumArray[i][j-1];
				if(i>=a[j-1]) {
					sumArray[i][j] |= sumArray[i-Math.abs(a[j-1])][j-1];  
				}
			}
		}
		
		System.out.println(sumArray[sum][a.length]);
	}
	
	public static void print(int i, int j, int a[]) {
		for(int x=i;x<=j;x++) {
			System.out.print(a[x]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int a[]={1, 2, 3, 4, 5};
		findSubSet(2, a);
	}
}
