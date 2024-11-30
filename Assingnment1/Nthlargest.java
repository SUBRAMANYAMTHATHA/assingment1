package Assingnment1;

import java.util.Arrays;

public class Nthlargest {
	
		public static int[] nth(int[] a) {
			// int[] a = {6,9,8,5,7,3,4,1,2,};
			 
			 for(int i =0;i<a.length;i++) {
				 for(int j=0;j<a.length;j++) {
					 if(a[i]<a[j]) {
						 int temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
						 
					 }
				 }
			 }
			 return a;
		//System.out.println();
			}
		public static void main(String[] args) {
			int[] a = {6,7,4,5,9,8,2,3,1};
			System.out.println(Arrays.toString(nth(a)));
		int nthlargest = 3;
		int nthsmallest = 1;
		System.out.println("The 3rd largest is" +" " + a[a.length-nthlargest]);
		System.out.println("The 1st smallest is" + " "+a[nthsmallest-1]);
		}
		}


