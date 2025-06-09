package project1_3;

public class day3_mainprogram {

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	  
	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    
	    public void reverseIterative() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
	    public Node reverseRecursive(Node node) {
	        if (node == null || node.next == null) {
	            return node;
	        }
	        Node rest = reverseRecursive(node.next);
	        node.next.next = node;
	        node.next = null;
	        return rest;
	    }

	   
	    public void display() {
	        Node current = head;
	        if (current == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        System.out.print("Linked List: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	 day3_mainprogram list = new  day3_mainprogram();
	        list.addNode(10);
	        list.addNode(20);
	        list.addNode(30);
	        list.addNode(40);

	        System.out.println("Original List:");
	        list.display(); 

	        list.reverseIterative();
	        System.out.println("After Iterative Reversal:");
	        list.display();

	       
	        list.head = list.reverseRecursive(list.head);
	        System.out.println("After Recursive Reversal:");
	        list.display(); 
	    }
	}



