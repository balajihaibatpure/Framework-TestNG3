package allprogram;

public class A {
//int i=10;
//int d =20;
//void same() {
//	System.out.println("balaji");
//}
//
	public static int[] multiplyExceptIndex(int[] arr) {
//	
//	A a=new A();
//	System.out.println(a.i);
//	//System.out.println(a.d);
//	a.same();
	
//	int val=40;
//	String name="balaji";
//	for ( int i=name.length()-1;i>=0;i--) {
//		
//		System.out.print(name.charAt(i));
//	}
	
	        if (arr == null || arr.length < 2) {
	            return new int[0];
	        }

	        int n = arr.length;
	        int[] result = new int[n];
	        int product = 1;

	        // Calculate left products
	        for (int i = 0; i < n; i++) {
	            result[i] = product;
	            product *= arr[i];
	        }

	        product = 1;

	        // Calculate right products
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= product;
	            product *= arr[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int[] result = multiplyExceptIndex(arr);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	

}



	





	


