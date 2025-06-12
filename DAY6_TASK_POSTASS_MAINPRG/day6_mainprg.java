package project1_6;

public class day6_mainprg {
	    private int[] arr;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public day6_mainprg(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        front = 0;
	        rear = -1;  // rear starts before the first element
	        size = 0;
	    }

	    // Enqueue operation: add element at rear
	    public void enqueue(int item) {
	        if (isFull()) {
	            throw new RuntimeException("Queue is full");
	        }
	        rear = (rear + 1) % capacity;  // circular increment
	        arr[rear] = item;
	        size++;
	    }

	    // Dequeue operation: remove element from front
	    public int dequeue() {
	        if (isEmpty()) {
	            throw new RuntimeException("Queue is empty");
	        }
	        int item = arr[front];
	        front = (front + 1) % capacity;  // circular increment
	        size--;
	        return item;
	    }

	    // Check if queue is empty
	    public boolean isEmpty() {
	        return size == 0;
	    }

	    // Check if queue is full
	    public boolean isFull() {
	        return size == capacity;
	    }

	    // Get the front element without removing
	    public int peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Queue is empty");
	        }
	        return arr[front];
	    }

	    public static void main(String[] args) {
	    	day6_mainprg q = new day6_mainprg(5);
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        System.out.println(q.dequeue());  // 10
	        System.out.println(q.peek());     // 20
	        q.enqueue(40);
	        q.enqueue(50);
	        q.enqueue(60);

	        while (!q.isEmpty()) {
	            System.out.println(q.dequeue());
	        }
	    }
	}


