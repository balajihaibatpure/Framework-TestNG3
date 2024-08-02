package allprogram;

import java.io.InputStream;
import java.util.Scanner;

public class Newclass {

public static void main(String[] args) {
	    
        int i,j;
        for(i=1;i<=5;i++) {
        	for(j=1;j<=i;j++) {
        		
            	System.out.print("*");	
        }
        
        	System.out.print("\n");
        	
        }
//        int a,b,sum;
//        System.out.println("enter two number");
//        Scanner sc =new Scanner (System.in);
//       a= sc.nextInt();
//       b= sc.nextInt();      
//       sum= a+b;
//       System.out.println("addition"+ sum);
//       int n;
//       System.out.println("Enter any Number");
//      Scanner r =new Scanner (System.in);
//      n=r.nextInt();
//      if (n%2==0) {
//    	  System.out.println("even number");
//    	  }else {
//			System.out.println("odd number");
        
//		}
        
        int no,i1,fact=1;
        System.out.println("Enter any number");
        Scanner r =new Scanner(System.in);
        no=r.nextInt();
        if (no==1) {
			
		System.out.println("smalest prime no is 2");
        }
		for (i=2;i<no;i++) {
			if (no%i==0) {
				System.out.println("primtprime number");
				break;
			}if (no==i) {
				
			}
			System.out.println("isnotprime");
			
		}

		}
}



	


	


