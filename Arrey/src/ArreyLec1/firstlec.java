package ArreyLec1;

import java.util.Arrays;

public class firstlec {

	public static void main(String[] args) {
		String ar[]=new String[5];//subject
		ar[0]="Som";
		ar[1]="Tom";
		ar[2]="Dom";
		ar[3]="FM";
		ar[4]="Turbo";
		//For printing statement
		for (int i=0;i<=4;i++) {
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("------------");
		for (int i=0;i<=4;i++) {
			System.out.println(ar[i]);
		}
		 int num[]=new int[5];
		 num[0]=15;
		 num[1]=256;
		 num[2]=28;
		 num[3]=54;
		 num[4]=81;
		 Arrays.sort(num);
		 for (int i=4;i>=0;i--) {
				System.out.println(num[i]);
	}
	}
}
