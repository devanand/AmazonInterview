package simple;

import java.util.Arrays;

public class TrappingRainWater {

	static void trapWater(int a[]) {
		int quantity = 0;
		int right[]=new int[a.length];
		int left[]=new int[a.length];
		
		left[0]=a[0];
		for(int i=1;i<a.length;i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		
		right[a.length-1] = a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			quantity += Math.min(left[i], right[i])-a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		System.out.println(quantity);
	}
	
	public static void main(String[] args) {
		int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		trapWater(a);
	}
}
