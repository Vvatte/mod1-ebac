package Fila;

public class FilaFifo <T> {

        private Integer[] fila;
        private Integer front, rear, size;

        public FilaFifo(Integer capacity) {
            this.fila = new Integer[capacity];
            this.front = this.rear = -1;
            this.size = 0;
        }

        void enqueue(int x) {
            rear = (rear + 1) % fila.length;
            fila[rear] = x;
            size++;
        }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        int data = fila[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % fila.length;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return fila[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return fila[rear];
    }

    public int size() {
        return size;
    }


}


