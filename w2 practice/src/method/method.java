package method;

public class method {

	public static void main(String[] args) {
		System.out.println("print test");
		regularstatic();
		method error = new method ();
		error.test();
	}
	// static method
private static void regularstatic() {
	System.out.println("printing test error");
}// non static m
private void test() {
	System.out.println("prin1");
}

}
