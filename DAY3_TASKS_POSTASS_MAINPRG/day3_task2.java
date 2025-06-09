package project1_3;

public class day3_task2 {
	
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	  
	    public void insertAtPosition(int pos, int data) {
	        Node newNode = new Node(data);

	        
	        if (pos < 1) {
	            System.out.println("Invalid position!");
	            return;
	        }

	        if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node current = head;
	        int count = 1;

	        while (current != null && count < pos - 1) {
	            current = current.next;
	            count++;
	        }

	        if (current == null) {
	            System.out.println("Position out of range!");
	            return;
	        }

	        newNode.next = current.next;
	        current.next = newNode;
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
	    	day3_task2  list = new day3_task2();

	        
	        list.insertAtPosition(1, 10);
	        list.insertAtPosition(2, 20);
	        list.insertAtPosition(3, 30);
	        list.insertAtPosition(4, 40);

	       
	        list.display(); 

	        
	        list.insertAtPosition(3, 25);
	        list.display(); 
	      
	        list.insertAtPosition(10, 50); 
	    }
	}


