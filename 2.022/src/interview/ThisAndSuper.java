package interview;

public class ThisAndSuper extends Superclass{
	int a=25;
	public void Som() {
		int a=20;
		System.out.println(a);
		                               //"this" keyword allow print when two variables are duplicate. Here two a defines
		System.out.println(a);         //when normally printing global variable we simply mention in printing statement
		System.out.println(this.a);    //But when two variable are same. then for global variable we use this key word
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		ThisAndSuper S=new ThisAndSuper();
		S.Som();
		
		

	}

}
