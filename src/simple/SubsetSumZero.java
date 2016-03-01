package simple;

public class SubsetSumZero {

	public static void findSubSet(int sum, int a[]) {
		int sumArray[] = new int[a.length];
		
		sumArray[0] = a[0];
		for(int i=1;i<a.length;i++) {
			sumArray[i]=sumArray[i-1]+a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			int summi=a[i];			
			for(int j = 0;j<a.length;j++) {
				if(j>i) {
					summi += a[j];
					if(summi == 0) {
						print(i, j, a);
						continue;
					}
				}
				if(j>i && a[j] == (a[i]*-1)) {
					System.out.println(a[i]+" "+a[j]);
				}
				
				if(j>i && (sumArray[i] == (sumArray[j] * -1))) {
					
				}
			}
		}
	}
	
	public static void print(int i, int j, int a[]) {
		for(int x=i;x<=j;x++) {
			System.out.print(a[x]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int a[]={1, 2, -3, -1, -2};
		findSubSet(0, a);
	}
}
