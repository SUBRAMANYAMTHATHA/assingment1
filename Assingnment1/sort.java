package Assingnment1;

import java.util.Arrays;

public class sort {
	
	
	
	public int[] subbu(int[] st){
	for(int i=0; i<st.length; i++) {
		for(int j=i+1;j<st.length;j++) {
			if (st[i]>st[j]) {
			int temp = st[i];
			st[i] = st[j];
			st[j] = temp ;
		}
		}
	}
	return st;
	}
	
	public static void main(String[] args) {
		int st[] = {3,6,5,7,8,9,2};
		sort a = new sort();
		
		System.out.println(Arrays.toString(a.subbu(st)));
	}
	
}
