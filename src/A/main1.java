package A;
import B.E;
public class main1 {

	public static void man() {
		W.multi();
		W P1= new W();
		P1.division();
		
		
		E.sum();
		E P2= new E();
		P2.sub();
		

	}
	public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  for (int n=0;n<=30;n++)   { 
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
	}
}
