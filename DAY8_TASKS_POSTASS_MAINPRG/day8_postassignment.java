package project1_8;

public class day8_postassignment {

	    public static int firstOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1; 
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return result;
	    }

	    public static int lastOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1; 
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return result;
	    }

	    public static int countFrequency(int[] arr, int target) {
	        int first = firstOccurrence(arr, target);
	        if (first == -1) return 0; 
	        int last = lastOccurrence(arr, target);
	        return last - first + 1;
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6};
	        int target = 5;

	        int frequency = countFrequency(sortedArray, target);
	        System.out.println("Frequency of " + target + " is: " + frequency);
	    }
	}


