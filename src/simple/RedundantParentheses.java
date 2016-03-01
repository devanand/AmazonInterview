package simple;

public class RedundantParentheses {

	static void redundantParanthesis(String s) {
		char ch[] = s.toCharArray();
		int pa=0, op = 0;
		for(char c:ch) {
			if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
				op++;
			} else if(c == '(') {
				pa++;
			}
		}
		if(pa < op) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
	
	public static void main(String[] args) {
		String s = "( a + b ) + ( c + d )";
		redundantParanthesis(s);
	}
}
