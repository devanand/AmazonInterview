 package simple;

public class AdditionWithoutOperator {

	static int add(int a, int b) {
		if(b == 0) return a;
		return add( a ^ b, (a&b)<<1);
	}
	
	static int subtract(int a, int b) {
		if(b == 0) return a;
		return subtract(a ^ b, (~a&b)<<1);
	}
	
	public static void main(String[] args) {
		System.out.println(subtract(1, 2));
	}
}
