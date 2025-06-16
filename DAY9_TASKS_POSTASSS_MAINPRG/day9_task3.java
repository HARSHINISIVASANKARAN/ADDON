package project1_9;
import java.util.Arrays;
import java.util.Scanner;

public class day9_task3 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = {1, 3, 3, 3, 5, 7, 9};
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.print("Enter the target to count: ");
	        int target = scanner.nextInt();

	       
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        int lowerBound = left;

	        
	        left = 0;
	        right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        int upperBound = left;

	        int count = upperBound - lowerBound;
	        System.out.println("Target " + target + " appears " + count + " time(s) in the array.");

	        scanner.close();
	    }
	}

