package project1_2;
import java.util.Arrays;
public class day2_postassignment {
	

	
	    public static void main(String[] args) {
	        // Input array and target sum
	        int[] arr = {2, 3, 4, 5};
	        System.out.print(f"array {arr}");
	        int target = 7;

	        // Sort the array (if not already sorted)
	        Arrays.sort(arr);

	        // Initialize two pointers
	        int left = 0;
	        int right = arr.length - 1;

	        // Iterate using two pointers
	        while (left < right) {
	            int sum = arr[left] + arr[right];

	            if (sum == target) {
	                System.out.println("Pair found: " + arr[left] + " + " + arr[right]);
	                return;
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        System.out.println("No pair found with the given sum.");
	    }
	}



