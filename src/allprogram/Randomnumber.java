package allprogram;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		Random rm=new Random();
		for (int i=0;i<5;++i)
		{
		System.out.println("random number:  "+rm.nextInt(10));
		}

	}

}
