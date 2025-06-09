package project1_1;
import java.util.Scanner;
public class day1_task3 {
	


 
	   
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int terms = scanner.nextInt();
	        System.out.println("Fibonacci Series:");

	        for (int i = 0; i < terms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }

	        scanner.close();
	    }
	}




