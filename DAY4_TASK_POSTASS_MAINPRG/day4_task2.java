package project1_4;

public class day4_task2 {
	
	    class Node {
	        int data;
	        Node prev, next;

	        Node(int data) {
	            this.data = data;
	            prev = next = null;
	        }
	    }

	    private Node head, tail;
	    private int size;

	    public day4_task2() {
	        head = tail = null;
	        size = 0;
	    }

	  
	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	        size++;
	    }

	 
	    public void insertInMiddle(int data) {
	        if (head == null) {
	            addNode(data);
	            return;
	        }

	        Node newNode = new Node(data);
	        Node current = head;
	        int mid = size / 2;

	      
	        for (int i = 0; i < mid; i++) {
	            current = current.next;
	        }

	        
	        newNode.prev = current.prev;
	        newNode.next = current;
	        if (current.prev != null) {
	            current.prev.next = newNode;
	        } else {
	            head = newNode; 
	        }
	        current.prev = newNode;

	        size++;
	    }

	    
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	 day4_task2  list = new day4_task2();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(4);
	        list.addNode(5);

	        System.out.print("Original List: ");
	        list.display();

	        list.insertInMiddle(6);

	        System.out.print("List after inserting 6 in the middle: ");
	        list.display();
	    }
	}



