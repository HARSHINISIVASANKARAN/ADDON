package project1_5;


	class Node {
	    int data;
	    Node next;

	    Node(int d) {
	        data = d;   
	        next = null;
	    }
	}

	class day5_task2 {
	    Node head = null;
	    Node tail = null;

	    void insert(int d) {
	        Node newNode = new Node(d);

	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;  
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head;    
	        }
	    }

	    void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	day5_task2 cll = new day5_task2();

	        cll.insert(1);
	        cll.insert(2);
	        cll.insert(3);
	        cll.insert(4);

	        cll.display();
	    }
	

	}



