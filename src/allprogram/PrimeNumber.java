package allprogram;

public class PrimeNumber {

	public static void main(String[] args) {
	
  for(int i=2;i<=10; i++)
  {
	  boolean isprimenumber =true ;
	  for (int j=2;j<i;j++)
	  {
		  if(i%j==0)
		  {
			  isprimenumber= false;
			  break;
		  }
	  } 
	  if(isprimenumber)
	  {
		  System.out.println(i +"");
	  }
  }
	
  }
	
}
		