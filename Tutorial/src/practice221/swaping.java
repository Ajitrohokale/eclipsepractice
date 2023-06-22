package practice221;

public class swaping {
   public static void main(String[] args) {
	   swaping S=new swaping();
	   S.swap(20,12);
	   
	 
}
   public void swap(int a, int b) {
	  
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("a "+a);
	   System.out.println("b "+b);
   }
}
