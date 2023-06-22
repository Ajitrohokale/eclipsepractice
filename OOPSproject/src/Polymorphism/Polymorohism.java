package Polymorphism;

public class Polymorohism extends poly2{

	public static void main(String[] args) {
		Polymorohism S1= new Polymorohism();
		S1.M1(15,12,18);// this overriding
		S1.M1(20,10);
	}
	public void M1(int a,int s,int e) {
		int y=a*e/s;
		System.out.println(y);
	}

}
