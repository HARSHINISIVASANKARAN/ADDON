package project1_1;
import java.util.Scanner;


public class day1_postassignment {
	
	
	  
	    public static int sumOfDigits(int n) {
	        if (n == 0) {
	            return 0;
	        }
	        return (n % 10) + sumOfDigits(n / 10); 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();

	        int result = sumOfDigits(num);
	        System.out.println("The sum of digits is: " + result);
	    
	}

}
