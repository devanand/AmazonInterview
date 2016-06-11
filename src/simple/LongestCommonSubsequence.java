package simple;

public class LongestCommonSubsequence {

	static void longestCommonSubsequence(String s1, String s2) {
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		int buffer[][] = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++) {
			buffer[i][0] = 0;
		}
		
		for(int i=0;i<=s2.length();i++) {
			buffer[0][i] = 0;
		}
		int i=0, j=0;
		for(i=1;i<buffer.length;i++) {
			for(j=1;j<buffer[i].length;j++) {
				if(str1[i-1] == str2[j-1]) {
					buffer[i][j] = buffer[i-1][j-1]+1;
				} else {
					buffer[i][j] = Math.max(buffer[i-1][j], buffer[i][j-1]);
				}
			}
		}
		
		for(i=1;i<buffer.length;i++) {
			for(j=1;j<buffer[i].length;j++) {
				System.out.print(buffer[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		longestCommonSubsequence("abcd", "abcd");
	}
}
