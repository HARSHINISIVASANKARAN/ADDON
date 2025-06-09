package project1_2;
import java.util.Arrays;
import java.util.Scanner;

public class day2_task2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();
	        int[] originalArray = new int[size];

	      
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < size; i++) {
	            originalArray[i] = scanner.nextInt();
	        }

	    
	        Arrays.sort(originalArray);
	        int[] sortedArray = new int[size];
	        for (int i = 0; i < size; i++) {
	            sortedArray[i] = originalArray[size - 1 - i];
	        }

	        
	        System.out.println("Sorted array in descending order:");
	        System.out.println(Arrays.toString(sortedArray));

	        scanner.close();
	    }
	}


