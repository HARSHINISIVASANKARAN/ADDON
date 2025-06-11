package project1_5;

	class day5_mainprg {
	    Node head;

	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Method to insert node at the end (for testing purpose)
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else {
	            Node temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	    }

	    // Method to delete node at a given position (1-based index)
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        // If only one node and position is 1
	        if (head.next == head && position == 1) {
	            head = null;
	            return;
	        }

	        Node current = head, prev = null;
	        int count = 1;

	        // If head needs to be removed
	        if (position == 1) {
	            // Find last node to update its next pointer
	            while (current.next != head) {
	                current = current.next;
	            }
	            current.next = head.next;
	            head = head.next;
	            return;
	        }

	        current = head;
	        // Traverse to the node before the one we want to delete
	        while (count < position && current.next != head) {
	            prev = current;
	            current = current.next;
	            count++;
	        }

	        // If position is more than number of nodes
	        if (count != position) {
	            System.out.println("Position out of bounds");
	            return;
	        }

	        // Delete current node
	        prev.next = current.next;
	    }

	    // Method to print the list
	    public void printList() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	day5_mainprg cll = new day5_mainprg();
	        cll.insert(10);
	        cll.insert(20);
	        cll.insert(30);
	        cll.insert(40);
	        cll.insert(50);

	        System.out.print("Original List: ");
	        cll.printList();

	        cll.deleteAtPosition(3);
	        System.out.print("After deleting position 3: ");
	        cll.printList();

	       
	    }
	}


