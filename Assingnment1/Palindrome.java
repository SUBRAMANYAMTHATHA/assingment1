package Assingnment1;

public class Palindrome {
	//private static int i;

	public static void main (String[] args) {
		String v1 = "RAR";
		String v2 = "";
		for (int k=v1.length()-1;k>=0;k--){
			v2 = v2 + v1.charAt(k);
		}
		System.out.println(v1.equals(v2));
	}

}
