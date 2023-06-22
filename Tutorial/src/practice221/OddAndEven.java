package practice221;

public class OddAndEven {
	int i;
	int j=80;
	public static void main(String[] args) {
		OddAndEven A=new OddAndEven();
		A.even();
		
		A.Odd();
		
		
	}
	public void even() {
		
		System.out.print(" this is even no =(");
		for ( i=2;i<=j;i=i+2) {
			
			System.out.print(i+",");
		}
		System.out.println(")");
	}
	public void Odd() {
		System.out.print(" This is odd no = (");
		for(i=1;i<=j;i=i+2) {
			System.out.print(i+",");
			
		}
		System.out.println(")");
	}

}
