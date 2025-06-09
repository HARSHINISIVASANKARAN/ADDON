package project1_1;
import java.util.Arrays;
public class day1_task1 {
	

	
	    public static void main(String[] args) {
	        int[] originalArray = {2, 3, 4};
	        int newElement = 1;

	        int[] newArray = new int[originalArray.length + 1];

	       
	        newArray[0] = newElement;

	      
	        for (int i = 0; i < originalArray.length; i++) {
	            newArray[i + 1] = originalArray[i];
	        }

	        	        System.out.println(Arrays.toString(newArray));
	    }
	}



