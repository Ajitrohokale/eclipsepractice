package parameter;

public class parametertarization {

	public static void main(String[] args) {
		add (5,15,1.2d);
		add (12,20,2.22d);
		parametertarization R=new parametertarization();
		R.minus (12.5f,2.5f,10);
		R.minus(15.9f,12.9f,2);
		R.division (12,1.44d);
        R.AreaC(2.5f);
        R.AreaC(3.5f);
        R.AreaR(15,15);
	}

	public static void add(int a,int b,double c) {
		double d=a+(b+c);
		System.out.println(d);
		
	}
	public void minus(float a, float b, int c) {
		float d= a-b+c;
		System.out.println(d);
		
	}
	public void division (int a,double b) {
		double c = a/b;
		double d= b/a;
				System.out.println("division " +c);
				System.out.println(d);
	}
	public void AreaC(float a) {
		float e =(float) 3.14*(a*a/4);
		System.out.println("area of circal for "+a+" is "+e);
	}
	public void AreaR(int t,int y) {
	int q= t*y;
	System.out.println("area of reactangle for "+t+" and "+y+" is "+q);
		
	}
}


