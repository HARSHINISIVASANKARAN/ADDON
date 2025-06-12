package project1_6;

public class day6_task3 {
	    private static class Node {
	        int data;
	        Node next;
	        Node(int data) { this.data = data; }
	    }
	    
	    private Node front;  // dequeue from here
	    private Node rear;   // enqueue here
	    
	    // Add item to queue (enqueue)
	    public void enqueue(int item) {
	        Node newNode = new Node(item);
	        if (rear != null) {
	            rear.next = newNode;
	        }
	        rear = newNode;
	        
	        if (front == null) {
	            front = rear;
	        }
	    }
	    
	    // Remove item from queue (dequeue)
	    public int dequeue() {
	        if (front == null) {
	            throw new RuntimeException("Queue is empty");
	        }
	        int item = front.data;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        return item;
	    }
	    
	    // Simple test
	    public static void main(String[] args) {
	    	day6_task3 q = new day6_task3();
	        q.enqueue(100);
	        q.enqueue(200);
	        System.out.println(q.dequeue()); // 100
	        q.enqueue(300);
	        System.out.println(q.dequeue()); // 200
	        System.out.println(q.dequeue()); // 300
	    }
	}


