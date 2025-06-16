package project1_9;
import java.util.*;
public class day9_task1 {

	    public static void main(String[] args) {
	    	Scanner sd =new Scanner (System.in);
	        int[] arr = {1, 3, 5, 7, 9};
	        System.out.println(Arrays.toString(arr));
	        System.out.println("ENTER THE TARGET TO KNOW THE LOWER BOUND VALUE");

	        int target = sd.nextInt();

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

	        
	        System.out.println("Lower bound index: " + left);

	        if (left < arr.length) {
	            System.out.println("Lower bound value: " + arr[left]);
	        } else {
	            System.out.println("No element ≥ target, insertion point is at the end.");
	        }
	    }
	}
