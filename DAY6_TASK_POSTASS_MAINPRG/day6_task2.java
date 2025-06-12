package project1_6;

import java.util.Scanner;

public class day6_task2 {
    static int maxSize = 5;
    static int[] stack = new int[maxSize];
    static int top = -1;

    static void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot insert " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            int popped = stack[top--];
            System.out.println(popped + " popped from stack.");
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is " + stack[top]);
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push (Insert)");
            System.out.println("2. Pop (Remove)");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
