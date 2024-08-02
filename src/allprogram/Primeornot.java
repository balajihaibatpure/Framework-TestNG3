package allprogram;

public class Primeornot {

	public static void main(String[] args) {
		
		        int number = 29;
		        boolean isPrime = true;

		        if (number <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(number); i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		        
		        String str ="balaji";
		        for( int i=str.length()-1;i<=0;i--) {
		        	System.out.println(str.charAt(i));
		        	
		        }
		        
		        
		        
	}
		}
