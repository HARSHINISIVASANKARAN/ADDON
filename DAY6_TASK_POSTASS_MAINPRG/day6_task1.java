package project1_6;

public class day6_task1 {
	    int[] stack = new int[5];  // stack size 5
	    int top = -1;              // start with empty stack

	    // Push method - insert element into stack
	    void push(int value) {
	        if (top == stack.length - 1) {
	            System.out.println("Stack is full!");
	        } else {
	            top++;               // move top up
	            stack[top] = value;  // insert value
	            System.out.println(value + " inserted.");
	        }
	    }

	    public static void main(String[] args) {
	    	day6_task1 s = new day6_task1();

	        s.push(10);
	        s.push(20);
	        s.push(30);
	    }
	}

