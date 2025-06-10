package project1_4;
import java.util.Scanner;

public class Day4_PostAssignment {
    // Node class representing each element in the doubly linked list
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    // DoublyLinkedList class containing methods for various operations
    static class DoublyLinkedList {
        Node head, tail;
        int size;

        // Constructor to initialize an empty list
        DoublyLinkedList() {
            head = tail = null;
            size = 0;
        }

        // Method to add a node at the beginning
        void insertAtFront(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        // Method to add a node at the end
        void insertAtEnd(int data) {
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

        // Method to insert a node after a specific node
        void insertAfter(int afterData, int data) {
            Node current = head;
            while (current != null && current.data != afterData) {
                current = current.next;
            }
            if (current != null) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                current.next = newNode;
                size++;
            } else {
                System.out.println("Node with data " + afterData + " not found.");
            }
        }

        // Method to delete a specific node
        void delete(int data) {
            Node current = head;
            while (current != null && current.data != data) {
                current = current.next;
            }
            if (current != null) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
            } else {
                System.out.println("Node with data " + data + " not found.");
            }
        }

        // Method to search for a node
        void search(int data) {
            Node current = head;
            int position = 1;
            while (current != null) {
                if (current.data == data) {
                    System.out.println("Node with data " + data + " found at position " + position);
                    return;
                }
                current = current.next;
                position++;
            }
            System.out.println("Node with data " + data + " not found.");
        }

        // Method to traverse the list from front to back
        void traverseForward() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            System.out.print("List (Forward): ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to traverse the list from back to front
        void traverseBackward() {
            Node current = tail;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            System.out.print("List (Backward): ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }

        // Method to reverse the list
        void reverse() {
            Node current = head, temp = null;
            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }
            if (temp != null) {
                head = temp.prev;
            }
            System.out.println("List reversed.");
        }

        // Method to display the list
        void display() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            System.out.print("List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main method to drive the menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int choice, data, afterData;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert After");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Traverse Forward");
            System.out.println("7. Traverse Backward");
            System.out.println("8. Reverse List");
            System.out.println("9. Display List");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter existing data to insert after: ");
                    afterData = scanner.nextInt();
                    list.insertAfter(afterData, data);
                    break;
                case 4:
                    System.out.print("Enter data to delete: ");
                    data = scanner.nextInt();
                    list.delete(data);
                    break;
                case 5:
                    System.out.print("Enter data to search: ");
                    data = scanner.nextInt();
                    list.search(data);
                    break;
                case 6:
                    list.traverseForward();
                    break;
                case 7:
                    list.traverseBackward();
                    break;
                case 8:
                    list.reverse();
                    break;
                case 9:
                    list.display();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);

        scanner.close();
    }
}


	