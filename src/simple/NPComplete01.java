package simple;

import java.util.Arrays;

public class NPComplete01 {
	
	static int weightValues(int weight, int weights[], int val[]) {
		int buffer[][] = new int[weights.length+1][weight+1];
		for(int i = 1;i<= weights.length;i++) {
			for(int j=1;j<=weight;j++) {
				if (weights[i-1]<=j){
					buffer[i][j] = Math.max(val[i-1]+buffer[i-1][j-weights[i-1]], buffer[i-1][j]);
				} else {
					buffer[i][j] = buffer[i-1][j];
				}
			}
		}	
		
		for(int i=0;i<=weights.length;i++) {
			System.out.println(Arrays.toString(buffer[i]));
		}
		return buffer[weights.length][weight];
	}
	
	public static void main(String[] args) {
		int val[] = {6, 10, 12};
	    int weights[] = {1, 2, 3};
	    int  weight = 5;
	    System.out.println(weightValues(weight, weights, val));
	    
	}

}
