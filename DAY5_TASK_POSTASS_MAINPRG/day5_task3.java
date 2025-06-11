package project1_5;


	class listNode {
	    int data;
	    Node next;

	    listNode(int d) {
	        data = d;
	        next = null;
	    }
	}

	class day5_task3 {
	    Node head = null;
	    Node tail = null;

	    // Insert at beginning
	    void insertAtBeginning(int d) {
	        Node newNode = new Node(d);

	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;
	        } else {
	            newNode.next = head;
	            head = newNode;
	            tail.next = head;
	        }
	    }

	    // Delete node from head
	    void deleteFromHead() {
	        if (head == null) {
	            System.out.println("List is empty, nothing to delete.");
	            return;
	        }

	        // If only one node
	        if (head == tail) {
	            head = null;
	            tail = null;
	            return;
	        }

	        // More than one node
	        head = head.next;
	        tail.next = head; // maintain circular link
	    }

	    // Display the list
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
	    	day5_task3 cll = new day5_task3();

	        cll.insertAtBeginning(30);
	        cll.insertAtBeginning(20);
	        cll.insertAtBeginning(10);

	        cll.display();  // Circular Linked List: 10 20 30 

	        cll.deleteFromHead();
	        cll.display();  // Circular Linked List: 20 30 

	        

	        cll.deleteFromHead();  // List is empty, nothing to delete.
	    }
	}

