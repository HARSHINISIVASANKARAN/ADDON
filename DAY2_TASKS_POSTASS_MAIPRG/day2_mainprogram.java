package project1_2;
import java.util.Scanner;
public class day2_mainprogram {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Check if the string is a palindrome
	        boolean isPalindrome = isPalindrome(input);

	        // Output result
	        if (isPalindrome) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }

	        sc.close();
	    }

	    // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String s) {
	        int left = 0;
	        int right = s.length() - 1;

	        // Compare characters while moving towards the center
	        while (left < right) {
	            // Skip non-alphanumeric characters
	            if (!Character.isLetterOrDigit(s.charAt(left))) {
	                left++;
	            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
	                right--;
	            } else {
	                // Compare characters (case-insensitive)
	                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
	                    return false;
	                }
	                left++;
	                right--;
	            }
	        }

	        return true;
	    }
	
}
