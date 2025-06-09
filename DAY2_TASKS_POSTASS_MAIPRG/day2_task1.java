package project1_2;
import java.util.Arrays;
public class day2_task1 {
	
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        
	       
	        int left = 0;
	        int right = arr.length - 1;
	        while (left < right) {
	        
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            
	        
	            left++;
	            right--;
	        }
	        
	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	    
	}


}
