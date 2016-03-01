package simple;

public class IsBinaryPalindrome {

	static void isPalindrome(int a) {
		int numOfBits = (int)(Math.floor((Math.log(a)/Math.log(2)))+1);
		int left = 0;
		int right = numOfBits - 1;
		while(left<right) {
			if(isBitSet(a, numOfBits-left) != isBitSet(a, numOfBits-right)) {
				System.out.println("NO");
				break;
			} 
			left++;
			right--;
		}
		System.out.println("YES");
	}
	
	static boolean isBitSet(int num, int index) {
		return (num & (1 <<(index - 1))) != 0;
	}
	
	public static void main(String[] args) {
		isPalindrome(5);
	}
}
