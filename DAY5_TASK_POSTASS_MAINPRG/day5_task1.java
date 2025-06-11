package project1_5;

 
class listnode {
    int data;
    Node next;

    listnode(int d) {
        data = d;    
        next = null;
    }
}

class day5_task1 {
    Node head = null;
    Node tail = null;

    
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
    	day5_task1 cll = new day5_task1();

        cll.insertAtBeginning(30);
        cll.insertAtBeginning(20);
        cll.insertAtBeginning(10);

        cll.display();  
    }}

	


