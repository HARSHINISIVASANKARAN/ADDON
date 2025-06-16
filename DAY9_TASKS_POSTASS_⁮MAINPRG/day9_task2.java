package project1_9;

import java.util.Arrays;
import java.util.Scanner;

public class day9_task2 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("ENTER THE TARGET TO KNOW THE UPPER BOUND VALUE");

        int target = sd.nextInt();

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Upper bound index: " + left);

        if (left < arr.length) {
            System.out.println("Upper bound value: " + arr[left]);
        } else {
            System.out.println("No element > target, insertion point is at the end.");
        }

        sd.close();
    }
}
