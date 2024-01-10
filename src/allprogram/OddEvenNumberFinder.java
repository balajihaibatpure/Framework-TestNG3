 package allprogram;

		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;

		public class OddEvenNumberFinder {
		    public static void main(String[] args) {
		        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		        List<Integer> oddNumbers = new ArrayList<>();
		        List<Integer> evenNumbers = new ArrayList<>();

		        for (int number : numbers) {
		            if (number % 2 != 0) {
		                oddNumbers.add(number);
		            } else {
		                evenNumbers.add(number);
		            }
		        }

		        System.out.println("Odd numbers: " + oddNumbers);
		        System.out.println("Even numbers: " + evenNumbers);
		    }
		


	}


