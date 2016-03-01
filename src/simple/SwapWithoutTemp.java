package simple;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		a= a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
