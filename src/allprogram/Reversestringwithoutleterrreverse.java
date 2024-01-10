package allprogram;

public class Reversestringwithoutleterrreverse {

	public static void main(String[] args) {
		
		
		String inputString = "hello how are you";

        String[] words = inputString.split(" ");
        StringBuilder reversedResult = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedResult.insert(0, reversedWord).insert(reversedWord.length(), " ");
        }

        System.out.println("Reversed string without reversing letters: " + reversedResult.toString().trim());
    }}
