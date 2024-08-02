package allprogram;

public class PalindreomNumber {

	public static void main(String[] args) {
	
		        String str = "122";
		        boolean isPalindrome = new StringBuilder(str).reverse().toString().equals(str);
		        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
		    }
		


	}

/*public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}*/

