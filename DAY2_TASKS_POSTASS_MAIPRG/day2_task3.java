package project1_2;
import java.util.Arrays;
import java.util.Scanner;

public class day2_task3 {
	
	
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

	      
	        int uniqueCount = 1; 
	        for (int i = 1; i < size; i++) {
	            if (sortedArray[i] != sortedArray[i - 1]) {
	                sortedArray[uniqueCount] = sortedArray[i];
	                uniqueCount++;
	            }
	        }

	       
	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < uniqueCount; i++) {
	            System.out.print(sortedArray[i] + " ");
	        }

	        scanner.close();
	    }
	}


