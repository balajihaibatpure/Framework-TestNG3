package allprogram;

import java.util.Arrays;

public class SameElementarry {

	public static void main(String[] args) {
		

		
		        int[] arr1 = {2, 4, 1, 5, 3};
		        int[] arr2 = {4, 2, 1, 5, 3};

		        boolean areEqual = Arrays.equals(arr1, arr2);

		        System.out.println(areEqual ? "Arrays contain the same elements" : "Arrays do not contain the same elements");
		    }
		


	}

/*import java.util.HashSet;

public class SameElementarry {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 1, 4, 1,4,5 };
        
        boolean hasSameElements = false;
        
        if (arr.length > 0) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (!set.add(arr[i])) {
                    hasSameElements = true;
                    break;
                }
            }
        }
        
        System.out.println(hasSameElements ? "Array contains the same elements" : "Array does not contain the same elements");
    }*/


