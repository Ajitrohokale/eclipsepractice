package ArreyLec1;

public class ArrayMatrix {
public static void main(String[] args) {
	int mat [][]=new int[3][3];
	mat[0][0]= 11   ;
	mat[1][0]= 12   ;
	mat[2][0]= 13   ;
	mat[0][1]= 21   ;
	mat[1][1]= 22   ;
	mat[2][1]= 23   ;
	mat[0][2]= 31   ;
	mat[1][2]= 32   ;
	mat[2][2]= 33   ;
	int i,j;
	for(i=0;i<=2;i++) {
		for (j=0;j<=2;j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println(" ");
	}
	}
}
