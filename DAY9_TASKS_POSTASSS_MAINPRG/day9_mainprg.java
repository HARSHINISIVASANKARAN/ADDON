package project1_9;
import java.util.Arrays;
import java.util.Scanner;

public class day9_mainprg {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = {1, 3, 5, 7, 9};
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	        System.out.print("Enter the element to find rank: ");
	        int target = scanner.nextInt();

	        int left = 0;
	        int right = arr.length;

	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        System.out.println("Rank of " + target + " is: " + left);

	        scanner.close();
	    }
	}


