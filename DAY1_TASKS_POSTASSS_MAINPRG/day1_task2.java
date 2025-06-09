package project1_1;

public class day1_task2 {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 7, 4, 8, 5, 9, 6};
	        int min = arr[0];
	        int max = arr[0];

	        for (int num : arr) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	    }
	}



