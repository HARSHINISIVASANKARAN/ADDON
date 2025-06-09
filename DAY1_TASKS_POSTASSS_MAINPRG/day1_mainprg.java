package project1_1;
import java.util.Scanner;
public class day1_mainprg {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[10]; 
	        int size = 0; 
	        int choice;

	        do {
	            System.out.println("\n--- Array Operations Menu ---");
	            System.out.println("1. Insert an element");
	            System.out.println("2. Delete an element");
	            System.out.println("3. Display elements");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    if (size < arr.length) {
	                        System.out.print("Enter element to insert: ");
	                        arr[size++] = sc.nextInt();
	                        System.out.println("Element inserted.");
	                    } else {
	                        System.out.println("Array is full. Cannot insert more elements.");
	                    }
	                    break;

	                case 2:
	                    if (size > 0) {
	                        System.out.print("Enter position to delete (1 to " + size + "): ");
	                        int pos = sc.nextInt();
	                        if (pos >= 1 && pos <= size) {
	                            for (int i = pos - 1; i < size - 1; i++) {
	                                arr[i] = arr[i + 1];
	                            }
	                            size--;
	                            System.out.println("Element deleted.");
	                        } else {
	                            System.out.println("Invalid position.");
	                        }
	                    } else {
	                        System.out.println("Array is empty. Nothing to delete.");
	                    }
	                    break;

	                case 3:
	                    if (size > 0) {
	                        System.out.print("Array elements: ");
	                        for (int i = 0; i < size; i++) {
	                            System.out.print(arr[i] + " ");
	                        }
	                        System.out.println();
	                    } else {
	                        System.out.println("Array is empty.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);

	        sc.close();
	    }
	}



