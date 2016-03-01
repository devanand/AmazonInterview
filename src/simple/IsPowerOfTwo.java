package simple;

public class IsPowerOfTwo {

	static boolean isPowerOfTwo(long number) {
		return (number & (number-1)) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(9));
	}
}
