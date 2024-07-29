package Fila;

import Lista.Node;

import java.util.LinkedList;

public class FilaFifo {

    private LinkedList<Integer> fila;
    private Integer size;

    public FilaFifo() {
        this.fila = new LinkedList<>();
        this.size = 10;
    }

    public void enqueue(Integer var) { // este O(1)
        fila.addLast(var); // O(1) adiciona a variavel no final da fila
    }

    public int dequeue() { // este
        return fila.removeFirst(); // O(1) retorna e remove o primeiro elemento da lista
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() { // este O(1)
        if (isEmpty()) { // O(1) se estiver vazio retorna - 1 e mostra amenssagem que esta vazio
            System.out.println("Fila is empty");
            return -1;
        }
        return fila.getFirst();// O(1) retorna o primeiro elemento
    }

    public int rear() { // este O(1)
        if (isEmpty()) { // O(1) se estiver vazio retorna - 1 e mostra amenssagem que esta vazio
            System.out.println("Fila is empty");
            return -1;
        }
        return fila.getLast();// O(1) retorna o ultimo elemento
    }

    public int size() {
        return size;
    }

    public void printList() {
         System.out.print(fila);
    }


}


