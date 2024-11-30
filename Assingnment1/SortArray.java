package Assingnment1;

import java.util.Arrays;

public class SortArray {
    
	
	static int[] method(int[] s) {
	    for(int i = 0 ; i<s.length; i++) {
		  for(int j=i+1; j<s.length; j++) {//
			  if(s[i]>s[j]) {  // 2>8 , 2>5,  2>7
				  int temp = s[i];
				  s[i]  = s[j];
				  s[j] = temp;
			  }
		  }	
	  } 
	    	    return s;
	    
	}

	public static void main(String[] args) {
		
		int array[]= {2,8,5,7,3,9,1,4};
		System.out.println(Arrays.toString(method(array)));
	
	//	int temp = 0;
		
		//System.out.println();
		
		 //Arrays.sort(s);
		
			//System.out.println(Arrays.toString(s));
	}
}

// for( int i = 0; i<s.length;i++) {
// for( int j = i+1; j <s.length; j++) {
// if(a(i)<a(j)) ;
