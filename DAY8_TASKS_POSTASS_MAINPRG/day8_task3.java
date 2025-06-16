package project1_8;

public class day8_task3 {

	    public static int search(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            }

	            if (nums[left] <= nums[mid]) {
	                if (nums[left] <= target && target < nums[mid]) {
	                    right = mid - 1; 
	                } else {
	                    left = mid + 1; 
	                }
	            } 
	            
	            else {
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
	        int[] arr = {4, 5, 6, 7, 0, 1, 2};
	        int target = 0;
	        int index = search(arr, target);

	        System.out.println("Index of target: " + index);  
	    }
	}



