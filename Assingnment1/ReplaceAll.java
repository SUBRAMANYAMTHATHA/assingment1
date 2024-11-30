package Assingnment1;

public class ReplaceAll {
	public static void main (String[] args) {
		//String s = "the weather is very cool here";
		 
	//methodrep();
   ReplaceAll stu = new ReplaceAll();
   stu.methodrep();
}

		
	
   public  void methodrep() {
	   String s = "the weather is very cool here";
	   String s1 = s.replace( "y", "@@" );
	   

	  System.out.println(s1.replace("o", "@"));
}
}
