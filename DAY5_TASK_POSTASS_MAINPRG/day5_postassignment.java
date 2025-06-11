package project1_5;
import java.util.Scanner;


	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class day5_postassignment {
	    private Node tail;

	    public day5_postassignment() {
	        tail = null;
	    }

	    // Insert node at the end of the list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail; // points to itself
	        } else {
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	        System.out.println(data + " inserted.");
	    }

	    // Display the list
	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = tail.next;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println();
	    }

	    // Delete node by value
	    public void delete(int key) {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = tail.next;
	        Node prev = tail;
	        boolean found = false;

	        do {
	            if (current.data == key) {
	                found = true;
	                if (current == tail && current.next == tail) { // only one node
	                    tail = null;
	                } else {
	                    prev.next = current.next;
	                    if (current == tail) {
	                        tail = prev;
	                    }
	                }
	                System.out.println(key + " deleted.");
	                break;
	            }
	            prev = current;
	            current = current.next;
	        } while (current != tail.next);

	        if (!found) {
	            System.out.println(key + " not found in the list.");
	        }
	    }

	    // Main menu-driven program
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        day5_postassignment cll = new day5_postassignment();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Display");
	            System.out.println("3. Delete");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int value = scanner.nextInt();
	                    cll.insert(value);
	                    break;
	                case 2:
	                    cll.display();
	                    break;
	                case 3:
	                    System.out.print("Enter value to delete: ");
	                    int delValue = scanner.nextInt();
	                    cll.delete(delValue);
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}



