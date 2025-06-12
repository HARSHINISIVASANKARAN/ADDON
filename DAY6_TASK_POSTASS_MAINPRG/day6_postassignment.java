package project1_6;

public class day6_postassignment {
	    private static class Node {
	        int data;
	        Node next;
	        Node(int data) { this.data = data; }
	    }

	    private Node top;  // top of stack

	    // Push: add item to top
	    public void push(int item) {
	        Node newNode = new Node(item);
	        newNode.next = top;
	        top = newNode;
	    }

	    // Pop: remove and return top item
	    public int pop() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        int item = top.data;
	        top = top.next;
	        return item;
	    }

	    // Peek: return top item without removing
	    public int peek() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return top.data;
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return top == null;
	    }

	    public static void main(String[] args) {
	    	day6_postassignment stack = new day6_postassignment();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println(stack.pop());  // 30
	        System.out.println(stack.peek()); // 20
	        System.out.println(stack.pop());  // 20
	        System.out.println(stack.pop());  // 10

	        // stack.pop();  // would throw exception: stack empty
	    }
	}


