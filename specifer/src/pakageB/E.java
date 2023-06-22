package pakageB;

public class E {
public static void main(String[] args) {
	E.W();
}
private static void W() {
	System.out.println("private");
}
 static void V() { // default access specifer 
	 System.out.println("default");
}
 public static void X() {
	 System.out.println(" protected");
 }
}
