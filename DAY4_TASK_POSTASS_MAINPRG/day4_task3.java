package project1_4;

public class day4_task3 {
	
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

	    public day4_task3() {
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

	    
	    public void deleteMiddleNode() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	       
	        if (slow == head) {
	            head = head.next;
	            if (head != null) {
	                head.prev = null;
	            }
	        } else if (slow == tail) {
	            tail = tail.prev;
	            if (tail != null) {
	                tail.next = null;
	            }
	        } else {
	            slow.prev.next = slow.next;
	            if (slow.next != null) {
	                slow.next.prev = slow.prev;
	            }
	        }

	        size--;
	        System.out.println("Middle node deleted successfully.");
	    }

	    public void display() {
	        Node current = head;
	        if (head == null) {
	            System.out.println("Empty list.");
	            return;
	        }
	        System.out.print("Doubly linked list: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	day4_task3 list = new day4_task3();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(4);
	        list.addNode(5);
	        list.addNode(6);
	        list.addNode(7);

	        System.out.println("Before deletion:");
	        list.display();

	        list.deleteMiddleNode();

	        System.out.println("After deletion:");
	        list.display();
	    }
	}


