package simple;

public class NextPalindrome {

	static void nextPalindrome(int n) {
		int digits = 0;
		int temp = n;
		int lastDigit = temp%10;
		int firstDigit = 0;
		while(temp!=0) {
			if(temp/10 == 0) {
				firstDigit = temp%10;
			}
			temp = temp/10;
			digits++;
		}
		int tens = (int)(Math.pow(10, digits/2));
		n = (n/tens);
		if(firstDigit<lastDigit) {
			n++;
		}
		temp = (digits&1) == 0?n:(n/10);
		while(temp!=0) {
			int x = temp%10;
			n = n*10+x;
			temp = temp/10;
		}
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		nextPalindrome(12220);
	}
}
