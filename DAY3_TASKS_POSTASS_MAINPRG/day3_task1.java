package project1_3;

public class day3_task1 {
	
	    
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	    // Method to add a new node at the end of the list
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

	    // Method to traverse and print the list
	    public void traverse() {
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
	    	day3_task1 list = new day3_task1();
	        list.addNode(10);
	        list.addNode(20);
	        list.addNode(30);
	        list.addNode(40);
	        list.traverse(); 
	    }
	}




