package project1_8;
import java.util.Scanner;


public class day8_mainprg {


	    public static int search(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) return mid;

	            if (nums[left] <= nums[mid]) {
	                if (nums[left] <= target && target < nums[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            } else { 
	                if (nums[mid] < target && target <= nums[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the array (comma-separated): ");
	        String arrayInput = scanner.nextLine();
	        String[] parts = arrayInput.split(",");

	        int[] nums = new int[parts.length];
	        for (int i = 0; i < parts.length; i++) {
	            try {
	                nums[i] = Integer.parseInt(parts[i].trim());
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid number format in array.");
	                return;
	            }
	        }

	        System.out.print("Enter the target number: ");
	        int target;
	        try {
	            target = Integer.parseInt(scanner.nextLine().trim());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid target number.");
	            return;
	        }

	        int index = search(nums, target);
	        if (index != -1) {
	            System.out.println("Target found at index: " + index);
	        } else {
	            System.out.println("Target not found in the array.");
	        }
	    }
	}



