package simple;

public class FindTheLongestPalindromicSubString {
	static void longestPalindromeSubString(String ss) {
		char a[]= ss.toCharArray();
		int startIndex = 0, endIndex = 0;
		boolean isPalindromeFound = false;
		for(int i=0, j = a.length-1;i<j;) {
			int k = i, l = j;
			startIndex = k; endIndex = j;
			while(a[k] == a[l]) {
				k++;
				l--;
			}
			i=k+1;
			j = l-1;
			if(k>l) {
				isPalindromeFound = true;
				break;
			}
		}
		if(isPalindromeFound) {
			for(int i=startIndex;i<=endIndex;i++) {
				System.out.print(a[i]);
			}
		} else {
			System.out.println("This is a total waste of time");
		}
		
	}
	
	public static void main(String[] args) {
		longestPalindromeSubString("forgeeksskeegfor");
	}
}
