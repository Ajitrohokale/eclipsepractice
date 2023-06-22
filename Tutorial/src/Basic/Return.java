package Basic;

public class Return {

	public static void main(String[] args) {
		int A =cal(25,10);
		System.out.println(A);
		 Return R = new Return();
		int B= R.division(15, 15);
		 System.out.println(B);
	}
 public static int cal (int a, int s) {
	 int d=a+s;
	 return d;
	
	 
 }
 public int division(int f,int g) {
	int H=f+g;
	return H;
 }
}
