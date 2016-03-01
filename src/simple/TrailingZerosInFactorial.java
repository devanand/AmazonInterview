package simple;

public class TrailingZerosInFactorial {
	static int trailingZeros(int n) {
		if(n>=5) return trailingZeros(n/5)+n/5;
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeros(10));
	}
}
