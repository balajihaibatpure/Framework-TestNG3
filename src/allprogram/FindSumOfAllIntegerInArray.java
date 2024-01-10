package allprogram;

public class FindSumOfAllIntegerInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 12};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of all integers: " + sum);
    }
}

