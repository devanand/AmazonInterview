package simple;

import java.util.LinkedList;
import java.util.List;
public class PowerSet {

	static void powerSet(int a[]) {
		int count = 1<<a.length;
		List<List<Integer>> l = new LinkedList<>();
		for(int i=0;i<count;i++) {
			List <Integer> temp = new LinkedList<>();
			for(int j=0;j<a.length;j++) {
				if((i & 1<<j) != 0) {
					temp.add(a[j]);
				}
			}
			l.add(temp);
		}
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		int a[]= {1, 2, 3};
		powerSet(a);
	}
}
