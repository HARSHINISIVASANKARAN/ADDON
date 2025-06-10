package project1_4;

public class day4_mainprg {
	
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

	    public day4_mainprg() {
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

	  
	    public void traverseForward() {
	        Node current = head;
	        System.out.print("Forward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    
	    public void traverseBackward() {
	        Node current = tail;
	        System.out.print("Backward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	day4_mainprg list = new day4_mainprg ();
	        list.addNode(10);
	        list.addNode(20);
	        list.addNode(30);
	        list.addNode(40);
	        list.addNode(50);

	        list.traverseForward();  
	        list.traverseBackward(); 
	    }
	}

	


