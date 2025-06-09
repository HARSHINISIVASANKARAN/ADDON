package project1_3;
import java.util.Scanner;
public class day3_postassignment {
	

	
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	    
	    public void addAtBeginning(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    public void addAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    public void addAtPosition(int data, int position) {
	        if (position < 1) {
	            System.out.println("Invalid position!");
	            return;
	        }
	        if (position == 1) {
	            addAtBeginning(data);
	            return;
	        }
	        Node newNode = new Node(data);
	        Node current = head;
	        for (int i = 1; i < position - 1; i++) {
	            if (current == null) {
	                System.out.println("Position out of bounds!");
	                return;
	            }
	            current = current.next;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    
	    public void deleteFromBeginning() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        head = head.next;
	    }

	    public void deleteFromEnd() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.next == null) {
	            head = null;
	            return;
	        }
	        Node current = head;
	        while (current.next != null && current.next.next != null) {
	            current = current.next;
	        }
	        current.next = null;
	    }

	   
	    public void deleteAtPosition(int position) {
	        if (position < 1) {
	            System.out.println("Invalid position!");
	            return;
	        }
	        if (position == 1) {
	            deleteFromBeginning();
	            return;
	        }
	        Node current = head;
	        for (int i = 1; i < position - 1; i++) {
	            if (current == null || current.next == null) {
	                System.out.println("Position out of bounds!");
	                return;
	            }
	            current = current.next;
	        }
	        current.next = current.next.next;
	    }

	   
	    public void search(int data) {
	        Node current = head;
	        int position = 1;
	        while (current != null) {
	            if (current.data == data) {
	                System.out.println("Element " + data + " found at position " + position);
	                return;
	            }
	            current = current.next;
	            position++;
	        }
	        System.out.println("Element " + data + " not found.");
	    }

	  
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = head;
	        System.out.print("Linked List: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	   
	    public void reverse() {
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

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        day3_postassignment list = new day3_postassignment();
	        int choice, data, position;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add at Beginning");
	            System.out.println("2. Add at End");
	            System.out.println("3. Add at Position");
	            System.out.println("4. Delete from Beginning");
	            System.out.println("5. Delete from End");
	            System.out.println("6. Delete at Position");
	            System.out.println("7. Search");
	            System.out.println("8. Display");
	            System.out.println("9. Reverse");
	            System.out.println("10. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data: ");
	                    data = scanner.nextInt();
	                    list.addAtBeginning(data);
	                    break;
	                case 2:
	                    System.out.print("Enter data: ");
	                    data = scanner.nextInt();
	                    list.addAtEnd(data);
	                    break;
	                case 3:
	                    System.out.print("Enter data: ");
	                    data = scanner.nextInt();
	                    System.out.print("Enter position: ");
	                    position = scanner.nextInt();
	                    list.addAtPosition(data, position);
	                    break;
	                case 4:
	                    list.deleteFromBeginning();
	                    break;
	                case 5:
	                    list.deleteFromEnd();
	                    break;
	                case 6:
	                    System.out.print("Enter position: ");
	                    position = scanner.nextInt();
	                    list.deleteAtPosition(position);
	                    break;
	                case 7:
	                    System.out.print("Enter data to search: ");
	                    data = scanner.nextInt();
	                    list.search(data);
	                    break;
	                case 8:
	                    list.display();
	                    break;
	                case 9:
	                    list.reverse();
	                    break;
	                case 10:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 10);

	        scanner.close();
	    }
	}


